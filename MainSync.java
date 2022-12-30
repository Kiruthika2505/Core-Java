import java.util.*;
class Table
{
	synchronized void printtable(int n)
	{
		System.out.println("Thread Started... Table: "+n);
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Thread End... Table: "+n);
	}
}
class ThreadA extends Thread
{
	Table t;
	ThreadA(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printtable(6);
	}
}
class ThreadB extends Thread
{

	Table t;
	ThreadB(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printtable(10);
	}
}

class MainSync
{
	public static void main(String ars[])
	{
		Table obj = new Table();
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);
		
		t1.start();
		t2.start();
		
	
	}
}


/*
Create class for Synchronization
Synchronized method
thread Class
Using Synchronization class object - the object is the argument for Thread Constructor
Thread can access synchronised using the synchronization class object.

*/

















