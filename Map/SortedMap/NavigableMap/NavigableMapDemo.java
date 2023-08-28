import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args)
    {
        TreeMap<String,String> m = new TreeMap<String,String>();
        m.put("b","banana");
        m.put("c","cat");
        m.put("a","apple");
        m.put("d","dog");
        m.put("g","gun");
        System.out.println(m);//{a=apple, b=banana, c=cat, d=dog, g=gun}

        System.out.println(m.ceilingKey("c"));//c
        System.out.println(m.higherKey("e"));//g
        System.out.println(m.floorKey("e"));//d
        System.out.println(m.lowerKey("e"));//d
        System.out.println(m.pollFirstEntry());//a=apple
        System.out.println(m.pollLastEntry());//g=gun
        System.out.println(m.descendingMap());//{d=dog, c=cat, b=banana}
        System.out.println(m);//{b=banana, c=cat, d=dog}

    }
}
