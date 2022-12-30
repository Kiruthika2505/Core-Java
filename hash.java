import java.util.*;
class hash
{
public static void main(String args[]){
Map<Integer,String> ma=new HashMap<Integer,String>();
ma.put(5,"Five");
ma.put(25,"Two Five");
ma.put(12,"One Two");
ma.put(24,"Two Four");
System.out.println(ma);
System.out.println(ma.entrySet());
/*ma.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
System.out.println(ma);*/


}
}