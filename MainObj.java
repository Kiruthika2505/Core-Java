class Student5 implements Cloneable
{

	int rollno;
	String name;
	Student5(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
}
class MainObj
{
	public static void main(String arg[])
	{
		try
		{
			Student5 s1 = new Student5(145,"Vishnu");
			Student5 s2 = (Student5) s1.clone();
		
			System.out.println(s1.rollno + " " +s1.name);
			System.out.println(s2.rollno + " " +s2.name);
		}
		catch(CloneNotSupportedException e)
		{
				System.out.println(e);
		}
	}
}
















