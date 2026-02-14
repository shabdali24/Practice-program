package Java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class EvenNo {
    public static void main(String[] args) {

        List<Integer> li= Arrays.asList(12,3,45,9,6,3,23,54,11);
        List<Integer> EvenNumber=li.stream().filter(n->n%2==0)
               // .peek(n->System.out.println(n))
                .collect(Collectors.toList());

        System.out.println("Even number is :" + EvenNumber);
    }
}
