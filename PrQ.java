import java.util.*;
class PrQ
{
	public static void main(String arg[])
	{

		PriorityQueue<String> ls = new PriorityQueue<String>();

		ls.add("Happy");
		ls.add("Nice");
		ls.add("Awesome");
		ls.add("Awful");
		ls.add("Pleasant");
		ls.add("Read");
		ls.add("Study");
		ls.add("Iteration");
		
		System.out.println(ls);
		System.out.println("Head:"+ls.element());
		System.out.println(ls);
		System.out.println("Head:"+ls.peek());
		System.out.println(ls);
		System.out.println(ls.remove());
		System.out.println("After Removing"+ls);
		System.out.println("Poll Methods" +ls.poll());
		System.out.println("After Poll Methods" +ls);

		Iterator t = ls.iterator();
		while(t.hasNext())
		{

			System.out.println(t.next());
		}
		
	}
}
