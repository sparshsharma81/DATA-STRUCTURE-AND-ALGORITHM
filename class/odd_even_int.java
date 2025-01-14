import java.util.*;
public class odd_even_int {
    //in this program..the user needs to enter integers..and we need to sort the odd and even int at the respective order
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        System.out.println("Great..now enter the elements of the array/..");
        int [] arr = new int[a];
        for(int i = 0 ; i<a;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        while(start < end ){
            if(arr[start] %2 == 0 && arr[end] %2!=0){
               arr[start] = arr[start] + arr[end];
               arr[end] = arr[start] - arr[end];
               arr[start] = arr[start] - arr[end];
                start++;
                end--;
            }
            if(arr[start]%2!=0){
                start++;
            }
            if(arr[end]%2!=0){
                end--;
            }
        }
        for(int c:arr){
            System.out.print(c+" ");
        }
        sc.close();
    }
}
