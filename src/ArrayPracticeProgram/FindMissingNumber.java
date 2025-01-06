package ArrayPracticeProgram;
import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {
            {
                Scanner sc=new Scanner(System.in);
                int n;
                System.out.println("Enter the array size ");
                n=sc.nextInt();     //Initialize array size

                int arr[]=new int[n];   //Declare array
                System.out.println("Enter the elements of the array ");
                for(int i=0; i<n ;i++)     //Initialize array
                {
                    arr[i]=sc.nextInt();
                }

                int sum=(n+1)*(n+2)/2;   //Calculate the expected sum of all the elements from 1 to n
                for(int i=0;i<n;i++)
                {
                    sum=sum-arr[i]; //Subtract each element from the sum
                }
                System.out.println("Missing Element is "+sum);  //Print the missing element
            }
        }

    }