class Interp
{
	public static void main(String args[])
	{
		try
		{
				Thread th = new Thread();
				int i;
				for(i=5;i>=1;i--)
				{
					System.out.println("ThreadC Output:"+i);
					th.sleep(1000);		
				}
				System.out.println("Exit from ThreadC ");
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	
	}
}

