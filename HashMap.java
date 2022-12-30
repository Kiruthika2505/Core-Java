import java.util.*;
class HashMap
{
	public static void main(String arg[])
	{
		Map<Integer,String> ma= new HashMap<Integer,String>();
		ma.put(4,"Four");
		ma.put(89,"Eight Nine");
		ma.put(13,"One Three");
		ma.put(2,"Two");
		System.out.println(ma);
		for(Map.Entry m: ma.entrySet())
		{
				System.out.println("Key:  " +m.getKey()+ "  Value:" +m.getValue());
		}
		System.out.println(ma.entrySet());	
	
	}
}










