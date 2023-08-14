/*
W.A.P. to insert String and StringBuffer objects into TreeSet where the sorting order
is increasing length order . If two objects have same length then consider their alphabetical order.

[A, AA, XX, ABC, ABCD]
 */

import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo5 {
    public static void main(String[] args)
    {
        TreeSet t = new TreeSet(new MyComparator5());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t);
    }
}

class MyComparator5 implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 < l2)
            return -1;
        else if (l1 > l2)
            return +1;
        else
            return s1.compareTo(s2);
    }
}
