/*
   Write a code for pyramid pattern
 */

package AllPatternProgram.Starpattern;
import java.util.*;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.println("*");
            }
        }
    }

}
