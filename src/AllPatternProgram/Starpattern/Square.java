/*
   Write a code for square pattern.
 */

package AllPatternProgram.Starpattern;
import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){ // take limit (i<=n) same as inner loop for square
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
