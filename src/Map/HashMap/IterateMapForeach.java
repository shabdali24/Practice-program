package Map.HashMap;
import java.util.*;
public class IterateMapForeach {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(110, "Roy");
        map.put(111, "krish");
        map.put(112, "Joy");
        map.put(113, "Robrt");
        System.out.println("Map- pair:" + map);
        // foreach loop for iteration purpose for map
      /* for (Map.Entry<Integer, String> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // iterator for only keys, get the ey value (pair) format
        Set<Integer> keys=map.keySet();
        for (Integer key: keys){
            System.out.println(key+" "+map.get(key));
*/
            // delete or remove data from map
            map.remove(110);
            System.out.println(map);
        }
    }

