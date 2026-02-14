package Java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(19,15,20,25,3);
        List<Integer> OddNo=list.stream().filter(n-> n % 2!=0)
                .collect(Collectors.toList());

        System.out.println("Print Odd No:" + OddNo);
    }
}
