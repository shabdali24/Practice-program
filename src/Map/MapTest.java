package Map;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map m=new HashMap();
        m.put(1,"java");
        m.put(2,"python");
        m.put(3,"c");
        m.put(1,"java-script");

        System.out.println(m.containsKey(3));

        System.out.println(m.containsValue("python"));

        System.out.println(m.get(3));

        System.out.println(m);

    }


}
