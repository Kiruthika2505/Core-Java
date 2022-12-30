import java.lang.*;
class Student
{
	int rollno;
	String name;
	void getData(int rollno,String name)
	{
		this.rollno = rollno;
		this.name=name;
	}
	void display()
	{

		System.out.println(rollno+"\n"+name);
	}
}
class thi
{
	public static void main(String ars[])
	{
		Student s4 = new Student();
		s4.getData(10,"Arun");
		s4.display();
	}
}



