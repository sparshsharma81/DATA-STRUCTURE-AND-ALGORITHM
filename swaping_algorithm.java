import java.util.*;
public class swaping_algorithm{
    public static void main(String args[]){
        //we need to swap two numbers... 
        /*
         * int arr = [1,2,3,4,5,6,7,8];
         * swap = [2,1,4,3,6,5,8,7];
         * 
         * 
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Previous array: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }System.out.println();
        System.out.print("Swapped array:  ");
        for(int i =1;i<arr.length;i+=2){
            arr[i-1] = arr[i-1]+arr[i];
            arr[i] = arr[i-1] - arr[i];
            arr[i-1] = arr[i-1] - arr[i];
        }
        
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}