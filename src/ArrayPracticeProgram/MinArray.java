package ArrayPracticeProgram;
import java.util.*;
public class MinArray {
    public static void main(String args[]){
        int n, min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Min :" +min);
    }
}
