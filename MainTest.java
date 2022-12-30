class Test
{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible for voting");
		}
		else
		{
			System.out.println("Person is eligible for voting");
		}
	}
}
class MainTest
{
	public static void main(String ar[])
	{

			Test.validate(15);
			System.out.println("The Rest of code");
	}
}