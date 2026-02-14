package testcode;
import java.util.*;
public class BinarySearch{
        public static int binarySearch(int arr[], int target){
            int low=0;
            int high=arr.length-1;
            while(low<=high){
                int mid= low +(high-low)/2;

                if(arr[mid]==target){
                    return mid;
                } else if(arr[mid]<target){
                    low = mid+1;
                }else{
                    high=mid-1;
                }
            }
            return -1;
        }
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int [] arr={2,4,6,8,10,10,12,14};
            System.out.println("Enter the number to search :");
            int target =sc.nextInt();

            int result = binarySearch(arr, target);

            if(result!= -1){
                System.out.println("element found in index: " + result);
            }else{
                System.out.println("element not found");
            }
            sc.close();
        }
    }

