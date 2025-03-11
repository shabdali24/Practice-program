/*
* List creation ways its 3 way to create list
* */

package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListCreation {
    public static void main(String[] args) {

        List <Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);  // 1st way
//        List<Integer> list1 =new ArrayList<>(20); //2nd way
//        List<Integer> list2= new ArrayList<>(list1);
        List list1=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list1);

        List list2 = list.stream().map(n-> n*n).collect(Collectors.toList());
        System.out.println(list2);

        // List flatList = list.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
