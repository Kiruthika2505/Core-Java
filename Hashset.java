import java.util.*;
class Hashset
{
	public static void main(String arg[])
	{
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(4);
		h.add(89);
		h.add(13);
		h.add(2);
		h.add(89);
		h.add(4);
		System.out.println(h);
		Iterator<Integer> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("TreeSet");
		TreeSet<Integer> h1 = new TreeSet<Integer>();
		h1.add(4);
		h1.add(89);
		h1.add(13);
		h1.add(2);
		h1.add(33);		
		System.out.println(h1);
		System.out.println("LinkedSet");
		LinkedHashSet<String> h2 = new LinkedHashSet<String>();
		h2.add("One");
		h2.add("Three");
		h2.add("Two");
		h2.add( "Four");
		h2.add("One");
		System.out.println(h2);	
	}
}










