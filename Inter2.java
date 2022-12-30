interface Drawable
{
	void draw();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		double l = 25.4;
		double b = 30.2;
		System.out.println("Rectangle"+(l*b));
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		int a = 6;
		System.out.println("Circle"+(a*a));
	}
}
class Inter2
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.draw();
		r.draw();
	}
}







