final class Bike10
{
	int speed = 105;
	void run()
	{
		//speed = 78;
		System.out.println(speed);
	}
}
class Honda extends Bike10
{
	 void run()
	{
		//speed = 78;
		System.out.println(speed);
	}
}
class Fin
{
	public static void main(String arg[])
	{
		Honda obj = new Honda();
		obj.run();
	}
}