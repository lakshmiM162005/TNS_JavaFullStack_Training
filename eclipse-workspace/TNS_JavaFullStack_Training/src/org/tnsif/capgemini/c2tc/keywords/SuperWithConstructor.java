package org.tnsif.capgemini.c2tc.keywords;

class User
{
    User()
    {
        System.out.println("User account created");
    }
}

class AdminUser extends User
{
    AdminUser()
    {
        super(); // calls user constructor
        System.out.println("Admin privileges granted");
    }
}
public class SuperWithConstructor {

	public static void main(String[] args) {
		AdminUser obj = new AdminUser();
		System.out.println(obj);
	}

}