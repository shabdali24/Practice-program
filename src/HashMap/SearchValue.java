package HashMap;

import java.util.*;

public class SearchValue {
    public static void main(String[] args) {

        // map declaration nd object creation.
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 145);
        map.put("China", 130);
        map.put("US", 110);
        System.out.println(map);

        //search or lookup operation
        if (map.containsKey("US")){
            System.out.println("key is present");
        }else {
            System.out.println("key is not present");
        }

        if (map.containsKey("Indonesia")){
            System.out.println("key is present");
        }else {
            System.out.println("key is not present");
        }

        //get value of key
        System.out.println(map.get("US")); // value is present.
        System.out.println(map.get("Indonesia")); //value is not present.
    }
}


