import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args)
    {
        TreeMap m = new TreeMap(); // Default natural sorting order
        m.put(100,"ZZZ");
        m.put(103,"YYY");
        m.put(101,"XXX");
        m.put(104,106);
        //m.put("FFFF","XXX");//ClassCastException
        //m.put(null,"XXX");//NullPointerException
        System.out.println(m);//{100=ZZZ, 101=XXX, 103=YYY, 104=106}

        TreeMap m1 = new TreeMap(new myComparator());//Customized sorting order
        m1.put("XXX",10);
        m1.put("AAA",20);
        m1.put("ZZZ",30);
        m1.put("LLL",40);
        System.out.println(m1);//{ZZZ=30, XXX=10, LLL=40, AAA=20}

    }
}

class myComparator implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2) {
        String s1=obj1.toString();
        String s2=obj2.toString();

        return s2.compareTo(s1);
    }
}
