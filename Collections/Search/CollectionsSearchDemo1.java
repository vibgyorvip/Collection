import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo1 {
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l);
        Collections.sort(l,new MyComparator1());
        System.out.println(l);

        System.out.println(Collections.binarySearch(l,10,new MyComparator1()));//2
        System.out.println(Collections.binarySearch(l,13,new MyComparator1()));//-3
        System.out.println(Collections.binarySearch(l,17));//unpredictable result

    }
}
class MyComparator1 implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;

        return I2.compareTo(I1);
    }
}
