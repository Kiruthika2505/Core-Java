class Bike
{
	protected void run1()
	{
		System.out.println("Bike Starting Price Rs.80,500 onwards");
	}
}
class Splendor extends Bike
{
	void run()
	{
		run1();
		System.out.println("Splendor Bike Starting Price Rs.80,500 onwards");
		
	}
}
class MT
{
	public static void main(String args[])
	{

		Splendor s = new Splendor();// Upcasting
		s.run();
	}
}