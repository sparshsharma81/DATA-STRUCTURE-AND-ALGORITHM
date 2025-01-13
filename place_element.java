import java.util.*;
public class place_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Now enter the elements...");
        for(int i =0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Now enter the target: ");
        int pivot = sc.nextInt();
        // int[] arr = {1,2,5,6,2,3};
        int left = 0;
        int right = arr.length-1;
      
        while(left<=right){
            while(arr[left]<=pivot && left<=right){
                left++;
            }
            while(arr[right]>=pivot){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}