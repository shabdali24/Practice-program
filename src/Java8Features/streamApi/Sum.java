package Java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// use filter() for remove data it is intermediate operation.
public class Sum {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(12,13,26,7,8,1, 4322,6, 91,1,4322, 54, 56);
        List<Integer>sum=list.stream().filter(n->n%2==0)
                .map(n->n/2)
                .distinct() //UNIQUE DATA FETCH/GET
                .sorted((a,b)->(b-a))// if we use without parameter it take by default assending use comparator for custom sort
                .limit(3)// starrting ke kitne element chaiye
                .skip(2)// starting ke itne element nahi chahiye
                .peek(x-> System.out.println(x))// write method/print statement
                .collect(Collectors.toList());
        System.out.println("sum :" +sum);

       /* List<Integer>mappedlist=sum.stream().map(n->n/2).collect(Collectors.toList());
        System.out.println("mappedList :" + mappedlist);*/
    }
}
