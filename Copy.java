class Student
{
	int rollno;
	String name;
	Student(int r1,String n)
	{
		rollno = r1;
		name = n;
	}
	Student(Student ob) // Object is a Parameter
	{

		rollno = ob.rollno;
		name = ob.name;
	}
	void display()
	{
		System.out.println(rollno+"\n    "+name);
	}
}
class Copy
{
		public static void main(String args[])
		{
			Student s1 = new Student(123,"Santhosh");
			Student s2 = new Student(s1);
			s1.display();		
			s2.display();
		}
}