abstract class Bike
{
	 abstract void run();// showing the functionality
	
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Honda : 65.2");
	}

	void display()
	{
		System.out.println("Welcome to KGM");
	}
}
class AbtMain
{
	public static void main(String args[])
	{
		Honda obj = new Honda();
		obj.run();
		obj.display();
	}
}

/* Abtraction:

Showing the essential details/functionality and hiding the background information


Abtract class:

abstract class A
{

}

It should be extended(subclass) ---------- compulsory
It cannot be instantiated (object cannot created)
Abtract class contains abtract method/non abstract method

abtract method - it contains declaration

implemenation subclass

*/




















