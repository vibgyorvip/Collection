import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo1 {

    public static void main(String[] args)
    {
        //Default natural sorting order
        TreeSet t = new TreeSet();
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);

        //customized sorting order
        TreeSet t1 = new TreeSet(new MyComparator());
        t1.add(10);
        t1.add(0);
        t1.add(15);
        t1.add(5);
        t1.add(20);
        t1.add(20);
        System.out.println(t1);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1 , Object obj2)
    {
        Integer I1 =(Integer) obj1;
        Integer I2 =(Integer) obj2;

        if(I1 < I2)
            return +1;
        else if(I1 >I2)
            return -1;
        else
            return 0;
    }
}
