package exceptions;

public class Shital {
	
	String name;
	public static void main (String [] args) {
		
		
		  //HOLD THE CTRL BUTTON AND CLICK ON EXCEPTION
		System.out.println("Hello");
		System.out.println("My name is Shital");
		System.out.println("I am from pune");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException i) {
		System.out.println("can't divided by zero");
		}
		int arr[]= {1,2,3,4,5,6,7};
		try {
		System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println(i.getMessage());
		}
		System.out.println(10+10);
		System.out.println("Thank you");
		System.out.println("bye");
	}
}
