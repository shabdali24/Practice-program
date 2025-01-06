

package ArrayPracticeProgram;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {

        // scanner for user input
        Scanner sc = new Scanner(System.in);
        // array declaration
        int a[] = new int[8];

        System.out.println("Enter array element");
        //loop for read every input and print array
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            //System.out.print("Array is" +a[i]);
        }

        //loop for read even odd array
        System.out.println("Even Array is: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(+a[i]);
            }
            //else{
            //    System.out.println("Odd array is:"  +a[i]);
            //}
        }
        System.out.println("Odd array is: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(+a[i]);
            }

        }
    }
}