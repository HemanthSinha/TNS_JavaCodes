package Tns;

class User  //parent class
{
	User() //constructor
	{
		System.out.println("user account created");
	}
}

class AdminUser extends User
{
	AdminUser()
	{
		super();
		System.out.println("Admin privileges granted ");
	}
}
public class SuperWithConstructor {

	public static void main(String[] args) {
		AdminUser admin=new AdminUser();

	}

}
