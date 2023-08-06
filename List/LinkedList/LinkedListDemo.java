import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList l= new LinkedList();
        l.add("Vipul");
        l.add(30);
        l.add(null);
        l.add("Vipul");
        System.out.println(l);//[Vipul, 30, null, Vipul]
        l.set(0,"Software");//[Software, 30, null, Vipul]
        l.add(0,"ajeet");//[ajeet, Software, 30, null, Vipul]
        l.removeLast();     //[ajeet, Software, 30, null]
        l.addFirst("CCC"); //[CCC, ajeet, Software, 30, null]
        System.out.println(l);
    }
}
