package ArrayPracticeProgram;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(+a[i]);
        }
    }
}
