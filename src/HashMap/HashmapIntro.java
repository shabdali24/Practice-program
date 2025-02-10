package HashMap;
import java.util.*;
public class HashmapIntro {
    public static void main(String args[]) {

        // map declaration nd object creation.
        HashMap<String, Integer> map = new HashMap<>();

        //insert value in map.
        // map is key value pair format, key is always unique and value may be duplicate sometime.
        //map is unordered pair format order is not fix
        //map.put() in this function e have two cases 1.update existing value if value present or
        //2.create new value if value doesnt exists.those depends on key exesistance in pair
        map.put("India", 145);
        map.put("China", 130);
        map.put("US", 110);
        System.out.println(map);
        //1.case update existing pair
        map.put("US", 160);
        System.out.println(map);
        //2.case if value not present create new pair
        map.put("Butane", 90);
        System.out.println(map);
    }
}
