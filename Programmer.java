class Employee
{
	int salary = 40000;
}
class Programmer extends Employee
{
			int bonus = 15000;
			public static void main(String args[])
			{
			Programmer p = new Programmer();	
			System.out.println("Programmer Salary"+p.salary);
			System.out.println("Programmer Bonus"+p.bonus);	
			}
	
}