class RBI
{
	double r;
	protected String n1;
	protected void Interest(double r1)
	{
		r=r1;
		System.out.println("Interest Rate for Personal Account 6.0% with effect from 15.10.2022 onwards"+r);
	}
}
class SBI extends RBI
{
	void display(String name)
	{
		n1 = name;
		System.out.println("Bank Name:"+n1);
	}
		
}
class MainProt
{
	public static void main(String args[])
	{
		SBI obj = new SBI();
		obj.Interest(6.9);
		obj.display("SBI");
	}
}