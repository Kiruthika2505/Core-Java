import java.util.*;
class InvalidAgeException extends Exception
{

		InvalidAgeException(String str)
		{
			super(str);
		}
}

class Test
{
	public static int age;
	public static void validate() throws InvalidAgeException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();		
		if(age<18)
		{

			throw new InvalidAgeException("Age is less than 18 Not Eligible");
		}
		else
		{

			System.out.println("Age is greater than 18  Eligible");
		}
	}
}
class MainTest2
{
	public static void main(String args[])
	{
			try
			{
				Test.validate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
