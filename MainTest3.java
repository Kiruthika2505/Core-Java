import java.util.*;
class Test
{
	public static int m;
	public static int validate(int a,int b) throws ArithmeticException
	{
		m = a/b;
		return m;
	}
}
class MainTest3
{
	public static void main(String args[])
	{
			try
			{	
				int res;
				res = Test.validate(40,2);
				System.out.println(res);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
	}
}
