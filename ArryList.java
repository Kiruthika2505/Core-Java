import java.util.*;
public class ArryList
{
	public static void main(String args[])
	{

		ArrayList<String> ls = new ArrayList<String>();

		ls.add("Apple");
		ls.add("Mango");
		ls.add("Banana");
		ls.add("Apple");
		ls.add("Orange");
		ls.add("Apple");
		
		/*Iterator it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/

		for(String str:ls)
		{
			System.out.println(str);

		}
		System.out.println("Remove Element:"+ls.remove(0));
		System.out.println("Get Element using Index:"+ls.get(3));
		System.out.println("Remove Elements starting letter 'A':"+ls.removeIf(n->(n.charAt(0)=='A')));
}
}