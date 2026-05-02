package exceptions;
import java.util.Scanner;
public class A {
	public void checkAge()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You can drive");
		}
		else
		{
			throw new AgeNotFoundException("Age not valid for driving");
		}
	}
	
	public static void main(String [] args) {
		A a=new A();
		try {
		a.checkAge();
		}
		catch(AgeNotFoundException i)
		{
			System.out.println(i.getMessage());
		}
	}
}
