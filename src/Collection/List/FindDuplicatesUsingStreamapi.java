package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreamapi
{
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,1,5,4,3,9,2);
        List<Integer> unique=list.stream().distinct().collect(Collectors.toList());
        System.out.println("unique: " +unique);

        List<String> list1=Arrays.asList("Apple", "mango", "muskmelaon", "Apple", "mango");
        List<String> uni=list1.stream().distinct().collect(Collectors.toList());
        System.out.println("unique list: " +uni);



    }
}
