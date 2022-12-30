import java.util.*;
class Dq
{
	public static void main(String arg[])
	{

		Deque<String> ls = new ArrayDeque<String>();

		ls.add("Happy");
		ls.add("Nice");
		ls.add("Awesome");

		ls.addFirst("Morning");

		System.out.println("Elements in the Queue"+ls);

		ls.addLast("Evening");
		System.out.println("Elements in the Queue"+ls);
		
		ls.removeFirst();
		System.out.println("Elements in the Queue"+ls);
		
		ls.removeLast();
		System.out.println("Elements in the Queue"+ls);
		
	}
}
