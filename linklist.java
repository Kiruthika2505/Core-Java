import java.util.*;
public class linklist
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.add("1");
		ll.add("B");
		ll.add("D");
		ll.add("S");
		ll.add("K");
		ll.add("J");

		System.out.println("Original Contents = "+ll);

		ll.addLast("Z");
		System.out.println("Contents after adding 'z' at last = "+ll);

		ll.addFirst("A");
		System.out.println("Contents after adding 'A' atfirst  = "+ll);
	
		ll.remove("J");
		System.out.println("Contents after removing 'J'  = "+ll);

		ll.addLast("LL");
		System.out.println(" Contents = "+ll);

		ll.removeFirst();
		System.out.println("Contents after using removeFirst()  = "+ll);

		ll.removeLast();
		System.out.println("Contents after using removeLast()  = "+ll);

		Object val=ll.get(5);
		System.out.println( "printing the value="+val);
		System.out.println("getfirst = "+ll.getFirst());
		System.out.println("getlast = "+ll.getLast());
	}
}




