from flask import Flask, render_template, request, redirect, url_for
import pandas as pd
from sklearn.cluster import KMeans
import matplotlib.pyplot as plt
import os

app = Flask(__name__)

# --- Load dataset ---
df = pd.read_csv('Mall_Customers.csv')
X = df[['Annual Income (k$)', 'Spending Score (1-100)']].values

# --- Fit K-Means ---
kmeans = KMeans(n_clusters=5, init='k-means++', random_state=42)
df['Cluster'] = kmeans.fit_predict(X)

# --- Static folders ---
if not os.path.exists('static'):
    os.makedirs('static')

if not os.path.exists('history.csv'):
    # Create empty history
    pd.DataFrame(columns=['Age','Annual Income','Spending Score','Cluster']).to_csv('history.csv', index=False)

# --- Plot clusters ---
def plot_clusters():
    plt.figure(figsize=(8,6))
    colors = ['red','blue','green','cyan','magenta']
    for i in range(5):
        plt.scatter(X[df['Cluster']==i,0], X[df['Cluster']==i,1], s=50, c=colors[i], label=f'Cluster {i}')
    plt.scatter(kmeans.cluster_centers_[:,0], kmeans.cluster_centers_[:,1], s=200, c='yellow', label='Centroids', marker='*')
    plt.xlabel('Annual Income (k$)')
    plt.ylabel('Spending Score (1-100)')
    plt.legend()
    plt.title('Customer Segmentation')
    plt.savefig('static/cluster_plot.png')
    plt.close()

plot_clusters()

# --- Routes ---
@app.route('/')
def index():
    table_html = df.head().to_html(classes='data', index=False, border=0, escape=False)
    history = pd.read_csv('history.csv')
    history_html = history.to_html(classes='data', index=False, border=0, escape=False)
    return render_template('index.html', table_html=table_html, history_html=history_html)

@app.route('/predict', methods=['POST'])
def predict():
    # Get input from form
    age = int(request.form['age'])
    income = float(request.form['income'])
    score = float(request.form['score'])

    # Predict cluster
    cluster = kmeans.predict([[income, score]])[0]

    # Save to history
    new_entry = pd.DataFrame([[age, income, score, cluster]], columns=['Age','Annual Income','Spending Score','Cluster'])
    history = pd.read_csv('history.csv')
    history = pd.concat([history, new_entry], ignore_index=True)
    history.to_csv('history.csv', index=False)

    return render_template('result.html', age=age, income=income, score=score, cluster=cluster)

if __name__ == '__main__':
    app.run(debug=True)
