/* W.A.P. to insert string object into the Treeset where all elements should be inserted according to reverse of alphabatical order.
 O/P:- [Shbharani, Ramulamma, Rajakumari, Raja, GangaBhavani]
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator2());
        t.add("Raja");
        t.add("Shbharani");
        t.add("Rajakumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");
        System.out.println(t);
    }
}
    class MyComparator2 implements Comparator
    {
        public int compare (Object obj1 , Object obj2)
        {
            String s1 = (String) obj1;
            String s2 = obj2.toString();

            return s2.compareTo(s1);
        }
    }
