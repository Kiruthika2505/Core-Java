import java.util.*;
class deq
{
public static void main(String args[])
{
Deque<String> obj=new ArrayDeque<String>();
obj.add("Happy");
obj.add("Nice");
obj.add("Awesome");
System.out.println(obj);
obj.addFirst("Hello");
System.out.println(obj);
obj.addLast("Welcome");
System.out.println(obj);
obj.removeFirst();
System.out.println(obj);
obj.removeLast();
System.out.println(obj);


}
}
