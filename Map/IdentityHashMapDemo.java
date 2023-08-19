import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args)
    {
        Integer I1= new Integer(10);
        Integer I2= new Integer(10);

        HashMap m = new HashMap();
        m.put(I1,"Vipul");
        m.put(I2,"Ajeet");
        System.out.println(m);//{10=Ajeet}

        IdentityHashMap m1 = new IdentityHashMap();
        m1.put(I1,"Vipul");
        m1.put(I2,"Ajeet");
        System.out.println(m1);//{10=Vipul, 10=Ajeet}
    }
}
