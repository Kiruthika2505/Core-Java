import java.lang.*;
class Demo
{
	static int var = 56; // Instance variable
	static void display()
	{
		System.out.println( var*var);
	}
}
class Mn
{
	public static void main(String ars[])
	{
		//Demo obj = new Demo();// Instance i.e object ->  obj
		System.out.println(Demo.var);
		System.out.println(Math.sqrt(64));

		Demo.display();

	}
}



