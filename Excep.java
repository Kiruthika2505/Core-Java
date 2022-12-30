class Excep
{
	public static void main(String args[])
	{
		try
		{	

			int a=10/2;
			int b[] = {10,20,88};
			String s =null;
			System.out.println(b[1]);
			System.out.println(s.length());
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println("Empty String: "+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero: "+e);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index exceed array Size: "+e);

		}
		System.out.println("Remaining Code :");
	}
}





