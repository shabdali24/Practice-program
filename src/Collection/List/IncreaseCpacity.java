/*
* How to increase list capasity
* */

package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class IncreaseCpacity {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.ensureCapacity(20);
        System.out.println(list.isEmpty());
        list.add(12);
        System.out.println(list);

        String str="shabdali";
        String str1="shabdali";
        System.out.println(str.equals(str1));
    }
}
