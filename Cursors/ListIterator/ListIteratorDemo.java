import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.add("bala");
        l.add("venki");
        l.add("chiru");
        l.add("nag");
        System.out.println(l);//[bala, venki, chiru, nag]

        //to get objects 1-0-1 from any list collection object
        ListIterator Itr = l.listIterator();
        while(Itr.hasNext())
        {
            String s =(String)Itr.next();

            if(s.equals("venki"))
            {
                Itr.remove();
            } else if (s.equals("nag")) {
                Itr.add("chaitu");
            } else if (s.equals("chiru")) {
                Itr.set("charan");
            }
            
        }
        System.out.println(l);//[bala, charan, nag, chaitu]
    }
}
