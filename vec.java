import java.util.*;
import java.io.*;
public class vec
{
     public static void main(String args[])
     {
           try
            {
            		Vector v=new Vector(2);
           	 	System.out.println(" size="+v.size());

			System.out.println("capacity="+v.capacity());

			v.addElement(1);
			v.addElement(2);
			v.addElement(100.245);
			v.addElement(new String("CSC"));
			v.addElement(new String("CSC"));
			v.addElement(new String("CSC"));


      		 System.out.println(" size="+v.size());

            	System.out.println("elements of the vector="+v);
	
            	System.out.println("firstelement="+v.firstElement());
		System.out.println("Last Element "+v.lastElement());
			
		v.removeElementAt(1);
            	System.out.println("after removing the element at index 2"+v);

            		for(Enumeration e=v.elements(); e.hasMoreElements();)
			{
				System.out.println(e.nextElement());
			}
				
			v.removeAllElements();
                	System.out.println("first="+v.firstElement());
        }
	catch (Exception e){}
      }
}

/* enumeration is a dataype to represent symbolic name for a value */












