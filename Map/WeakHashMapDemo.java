import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException
    {
        Temp t = new Temp();
        //HashMap m = new HashMap();
        WeakHashMap m = new WeakHashMap();
        m.put(t,"vipul");
        System.out.println(m);

        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}
class Temp
{
    @Override
    public String toString() {
        return "temp";
    }

    public void finalize()
    {
        System.out.println("Finalize method called");
    }
}
