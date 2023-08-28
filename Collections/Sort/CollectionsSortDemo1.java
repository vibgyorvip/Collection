import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo1 {
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        System.out.println("Before sorting : "+ l);//[Z, A, K, N]

        //sort customized order
        Collections.sort(l,new MyComparator());
        System.out.println("After sorting : "+ l);//[Z, N, K, A]
    }
}

class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 =o1.toString();
        String s2 =o2.toString();

        return s2.compareTo(s1);
    }
}
