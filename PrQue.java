import java.util.*;
class PrQue
{
public static void main(String args[])
{
PriorityQueue<String> ls=new PriorityQueue<String>();
ls.add("Nice");
ls.add("Pleasant");
ls.add("Welcome");
ls.add("Hii");
ls.add("Hello");
System.out.println(ls);
System.out.println(ls.element());
System.out.println(ls.peek());
System.out.println(ls.remove());
System.out.println(ls);
System.out.println(ls.poll());
System.out.println(ls);
Iterator ts=ls.iterator();
while(ts.hasNext()){
System.out.println(ts.next());
}

}
}