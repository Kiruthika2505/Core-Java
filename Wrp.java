import java.util.*;
class Wrp
{
	public static void main(String args[])
	{

		Integer i1;// Wrapper Class
		Double d;


		int a;// int data type
		double d1;

		i1=10;
		d = 75.5;

		a = i1.intValue();// Wrapper class object i1 -> a intValue()
		d1 =d.doubleValue();

		System.out.println(a+"" +d1);
	}
}