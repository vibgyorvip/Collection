import java.util.HashSet;
public class HashSetDemo {

    public static void main(String[] args)
    {
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        //trying to add duplicate object then add() method will return false
        System.out.println(h.add("Z")); //false
        System.out.println(h);
    }
}
