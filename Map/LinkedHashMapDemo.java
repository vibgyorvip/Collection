import java.util.LinkedHashMap;

public class LInkedHashMapDemo {
    public static void main(String[] args)
    {
        LinkedHashMap m = new LinkedHashMap();//Insertion order preserved.
        m.put("chiranjivi",700);
        m.put("balaiah",800);
        m.put("venktesh",200);
        m.put("nagarjuna",500);
        System.out.println(m);// {chiranjivi=700, balaiah=800, venktesh=200, nagarjuna=500}
    }
}
