/*
* Java 8 Program to Find the Frequency of Each Character in a Given String?
* */

package Java8Features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {

        String str="hello world";
        Map<Character, Long> charfreq=str.chars().filter(c->c!=' ').mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        charfreq.forEach((character, frequency)-> System.out.println(" "+ character+ " - " +frequency));



    }
}
