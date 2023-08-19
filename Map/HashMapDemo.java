import java.util.*;

public class HashMapDemo {
    public static void main(String[] args)
    {
        HashMap m = new HashMap();
        m.put("chiranjivi",700);
        m.put("balaiah",800);
        m.put("venktesh",200);
        m.put("nagarjuna",500);
        System.out.println(m);//{Chiranjivi=700, balaiah=800, nagarjuna=500, Venktesh=200}
        System.out.println(m.put("chiranjivi",1000)); //700 oldValue

        Set s = m.keySet();
        System.out.println(s);//[balaiah, chiranjivi, nagarjuna, venktesh]

        Collection c =m.values();
        System.out.println(c);//[800, 1000, 500, 200]

        Set s1 = m.entrySet();
        System.out.println(s1);//[balaiah=800, chiranjivi=1000, nagarjuna=500, venktesh=200]

        //want to fetch entry set object 1-0-1===> cursor ===>Iterator
        Iterator itr = s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+"-----"+m1.getValue());

            if(m1.getKey().equals("nagarjuna"))
                m1.setValue("50000");

        }
        System.out.println(m);

    }
}
