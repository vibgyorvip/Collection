import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
    public static void  main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        System.out.println("Before sorting : "+ l);//[Z, A, K, N]

        //To sort D.N.S.O.
        Collections.sort(l);
        System.out.println("After sorting : "+ l);//[A, K, N, Z]
    }
}
