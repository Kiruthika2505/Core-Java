import java.util.*;
public class treeset
{
public static void main(String args[])
{
TreeSet tr=new TreeSet();
System.out.println("before adding the object"+tr);
tr.add("Pentagon");
tr.add("Global");
tr.add("Solution");
tr.add("Limited");
tr.add("SSI");
tr.add("NIIT");
tr.add("Radiant");
tr.add("SSI");
tr.add("ssi");
tr.add("Man");
tr.add("Man");

System.out.println("After adding the object"+tr+"\n");
tr.remove("NIIT");
System.out.println("After removing the 'NIIT' object"+tr+"\n");
System.out.println("headset of 'ssi'="+tr.headSet("Man"));
}
}


