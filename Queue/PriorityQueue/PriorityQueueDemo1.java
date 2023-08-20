import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args)
    {
        PriorityQueue q = new PriorityQueue(15,new MyComparator1());//Customized sorting order
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");

        System.out.println(q);
    }
}

class MyComparator1 implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        return s2.compareTo(s1);
    }
}
