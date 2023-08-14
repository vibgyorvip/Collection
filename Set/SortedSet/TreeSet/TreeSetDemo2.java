import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo2 {
    public static void main(String[] args)
    {
        TreeSet t = new TreeSet(new MyComparator1());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);

    }
}

 class MyComparator1 implements Comparator {
    public  int compare(Object obj1 , Object obj2 ){
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;

        return I1.compareTo(I2); //D.N.S.O. (Ascending order)

        //return -I1.compareTo(I2); // Descending order

        //return I2.compareTo(I1); //Descending order

        //return -I2.compareTo(I1); //Ascending order

        //return +1; // Insertion order

        //return -1; // reverse of Insertion order

        //return 0; // only first element will be inserted and remaining all are duplicates(considered as)

    }
}
