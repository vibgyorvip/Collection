import java.util.Hashtable;

public class HashTableDemo1 {
    public static void main(String[] args)
    {
        Hashtable h = new Hashtable();
        h.put(new Test(5),"A");
        h.put(new Test(2),"B");
        h.put(new Test(6),"C");
        h.put(new Test(15),"D");
        h.put(new Test(23),"E");
        h.put(new Test(16),"F");
        //h.put("durga",null);//NullPointerException
        System.out.println(h);//{16=F, 15=D, 6=C, 23=E, 5=A, 2=B} based on hashcode
    }
}

class Test
{
    int i;
    Test(int i)
    {
        this.i =i;
    }

    @Override
    public int hashCode() {
        return i%9;
    }

    @Override
    public String toString() {
        return i+"";
    }
}
