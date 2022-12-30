class Employee
{
	int salary = 40000;
	void emp()
	{
	System.out.println("Programmer Salary: "+salary);	
	}
}
class Programmer extends Employee
{
			int bonus = 15000;
			void calc()
			{
				int cal = bonus + salary;
				emp();
				System.out.println("Programmer Bonus: "+bonus);
				System.out.println("Total Amount:  "+cal);
			}						
}
class MainInher
{
		public static void main(String args[])
		{
			Programmer p = new Programmer();	
			p.calc();
		}
}