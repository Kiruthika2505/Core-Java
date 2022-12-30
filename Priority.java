class Thread1 extends Thread
{
	public void run()
	{
		int i,j=2,k;
		System.out.println("Thread1 Started.....");
		for(i=1;i<=5;i++)
		{
			k= i*j;
			System.out.println("Thread 1: "+i+"*"+j+"="+k);
		}
		System.out.println("Exit from Thread1");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		int i,j=3,k;
		System.out.println("Thread2 Started.....");
		for(i=1;i<=5;i++)
		{
			k= i*j;
			System.out.println("Thread 2:  "+i+"*"+j+"="+k);
		}
		System.out.println("Exit from Thread2");
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		int i,j=4,k;
		System.out.println("Thread3 Started.....");
		for(i=1;i<=5;i++)
		{
			k= i*j;
			System.out.println("Thread 3: "+i+"*"+j+"="+k);
		}
		System.out.println("Exit from Thread3");
	}
}
class Priority
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();		
		Thread3 t3 = new Thread3();

		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);	// 	t2.setPriority(	t1.getPriority()+1);
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}
}
























	



























