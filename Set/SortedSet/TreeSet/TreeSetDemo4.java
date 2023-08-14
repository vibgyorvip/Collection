/*
W.A.P. to insert StringBuffer objects into TreeSet where the Sorting order is alphabetical order.
 */
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {

    public  static void main(String[] args)
    {
        TreeSet t = new TreeSet(new MyComparator4());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);
    }
}

class MyComparator4 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        return s1.compareTo(s2);
    }
}
