class Fin1
{
	public static void main(String args[])
	{

		try
		{
			String s1 = "FootBall";
			int n = Integer.parseInt(s1);

			System.out.println("The String"+s1);
		}
		catch(Exception e)
		{
			System.out.println("Converting String to Integer:"+e);
		}
		finally
		{
			System.out.println("Finally block always executed");
		}
	}
}

		
	