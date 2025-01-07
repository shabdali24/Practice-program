/*
  Reverse the string using Scanner class and string buffer class.
 */

package StringProgram;
import java.util.*;
public class ScanReversSB {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter String");
        String str= sc.next();

        System.out.println("Reverse string is");

        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }

}
