/*
  Reverse a string using scanner class and iterating method.
 */

package StringProgram;
import java.util.*;
public class ScanRevriteM {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter String");
        String s=sc.next();

        char[] sArray= s.toCharArray();
        System.out.println("Reverse String is");
        for(int i=sArray.length-1;i>=0;i--){
            System.out.print(sArray[i]);
        }
    }
}
