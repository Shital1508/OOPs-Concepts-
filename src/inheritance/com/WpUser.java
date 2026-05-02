package inheritance.com;

public class WpUser extends User {
	
	WpUser(String username,String email,String password)
	{
		super(username,email,password);//parent constructor call
	}
	public static void main (String [] args) {
		
		WpUser w = new WpUser("shital","shital@gmail.com","Shital@123");
	}

}
