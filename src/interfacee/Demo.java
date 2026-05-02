package interfacee;

public class Demo implements Test3{
	
	@Override
	public void success()
	{
		System.out.println("Success");
	}
	
	@Override
	public void add() 
	{
		System.out.println("ADDITION");
	}
	
	@Override
	public void sub()
	{
		System.out.println("SUBSTRACTION");
	}
	
	@Override
	public void multiply()
	{
		System.out.println("MULTIPLY");
	}
	
	
	public void div()
	{
		System.out.println("DIVISION");
	}
	
	public static void main(String []args) {
		Demo d=new Demo();
		d.success();
		d.add();
		d.sub();
		d.multiply();
		d.div();
	}
	
	
}
