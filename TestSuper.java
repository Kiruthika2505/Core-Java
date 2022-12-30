class Hostel
{
	String name = "Vishnu";
	void eat()
	{
		System.out.println("Eating Bread Briyani..Tomorrow!");
	}
}
class DaysScholar extends Hostel
{
	String name = "Sandy";
	void eat()
	{
		System.out.println("Eating Chicken Briyani..Tomorrow!");

	}
	void print()
	{
		System.out.println("Student Name DaysScholar "+name);
		System.out.println("Student Name Hostel: "+super.name);
		super.eat();
	}
}
class TestSuper
{
	public static void main(String ars[])
	{
		DaysScholar d = new DaysScholar ();
		d.print();
		d.eat();
	}
}