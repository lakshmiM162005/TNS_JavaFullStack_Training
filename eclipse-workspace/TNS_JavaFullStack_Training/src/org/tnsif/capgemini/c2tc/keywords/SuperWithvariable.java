package org.tnsif.capgemini.c2tc.keywords;

class Notification
{
	String message = "Notification from parent class";
}
class PushNotification extends Notification
{
	String message = "Push Notification from WhatsApp";

    void showNotification() {
        System.out.println("Child message " + message);
        System.out.println("Parent Message " + super.message);
    }
}
public class SuperWithvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PushNotification obj = new PushNotification();
        obj.showNotification();

	}

}