import java.util.*;
import java.io.*;
public class Vct{
public static void main(String args[]){
try{
Vector vc=new Vector(2);
System.out.println("Size:"+vc.size());
System.out.println("Capacity:"+vc.capacity());
vc.addElement(100);
vc.addElement(2);
System.out.println(vc);
}
catch(Exception e){
System.out.println(e);
}
}
}