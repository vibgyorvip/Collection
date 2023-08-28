import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);
        Collections.sort(l);//D.N.S.O.
        System.out.println(l);

        //To search an element
        System.out.println(Collections.binarySearch(l,"Z"));//3 = Index
        System.out.println(Collections.binarySearch(l,"J"));//-2 = Insertion Point
        
    }
}
