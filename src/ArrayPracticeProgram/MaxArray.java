// write a program to find max element in array

package ArrayPracticeProgram;
import java.util.*;
public class MaxArray {
    public static void main(String[] args) {
        int n, max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("MAx :" +max);
    }
}
