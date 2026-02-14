package Java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        //convert list into stream
        List<String> li= Arrays.asList("Apple", "Mango","avocado");
        Stream<String> Mystreams=li.stream();

        //convert array into stream
        String [] array={"Apple","Mango","avocado"};
        Stream<String> stream=Arrays.stream(array);


        Stream<Integer> intergerStream=Stream.of(1,3,4,8);
    }
}
