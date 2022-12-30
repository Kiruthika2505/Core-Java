interface Bike10
{
	int speed = 78;
	void run();
}

class Honda implements Bike10
{
	 public void run()
	{
		
		System.out.println(speed);
	}
}
class Inter
{
	public static void main(String arg[])
	{
		Honda obj = new Honda();
		obj.run();
	}
}