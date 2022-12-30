class RBI
{
	protected void Interest()
	{
		System.out.println("Interest Rate for Personal Account 6.0% with effect from 15.10.2022 onwards");
	}
}
class SBI extends RBI
{

	
}
class MainProt
{
	public static void main(String args[])
	{
		SBI obj = new SBI();
		obj.Interest();
	}
}