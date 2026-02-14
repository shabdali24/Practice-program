/*
* Find maximum and minimum number in the list
* */

package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ListMaxMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(6,23,4,40,16,34,8);
        OptionalInt maxNumber = list.stream() // Convert list to stream
                .mapToInt(Integer::intValue) // Convert Integer to int
                .max(); // Find maximum value

        maxNumber.ifPresent(max -> System.out.println("Maximum Number: " + max));

        OptionalInt minNumber=list.stream()// convert list to stream
                .mapToInt(Integer::intValue)// convert integer to int
                . min(); // find min value
        minNumber.ifPresent(min-> System.out.println("Minimum Number: " +min));
    }
}
