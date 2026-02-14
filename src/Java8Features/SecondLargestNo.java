/*
* Find the second largest number
* */

package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNo {
    public static void main(String[] args) {

        List<Integer> n= Arrays.asList(91,95,92,90,90,90);
        Optional<Integer> SecondL=n.stream().
                distinct()
                .sorted(Comparator.naturalOrder())
                .skip(1)
                .findFirst();
        SecondL.ifPresent(secondl -> System.out.println("Second largest Number: " + secondl));


    }
}
