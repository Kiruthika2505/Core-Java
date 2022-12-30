class ThreadA extends Thread
{
	public void run()
	{
		int i,fact =1;
		for(i=1;i<=5;i++)
		{
			fact = fact *i;
			System.out.println("ThreadA output:"+fact);
		
		}
		System.out.println("Exit from ThreadA ");
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		int i,sum=0;
		for(i=1;i<=5;i++)
		{
			sum = sum +i;
			System.out.println("ThreadB Output:"+sum);
		
		}
		System.out.println("Exit from ThreadB ");
	}
}
class ThreadC extends Thread
{
	public void run()
	{
		int i;
		for(i=5;i>=1;i--)
		{
			System.out.println("ThreadC Output:"+i);
		
		}
		System.out.println("Exit from ThreadC ");
	}
}
class MainThread
{
	public static void main(String args[])
	{
		ThreadA obj1 = new ThreadA();
		ThreadB obj2 = new ThreadB();
		ThreadC obj3 = new ThreadC();

		obj1.start();
		obj2.start();
		obj3.start();
	}
}
