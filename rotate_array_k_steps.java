import java.util.*;
public class rotate_array_k_steps{
    static void rotate(int[]arr,int start , int end){
        while(start<=end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr [start] = arr[start] - arr[end];
            start++;
            end --;

        }
    }
    public static void main(String args[]){
        //now we are rotating an array with k steps...
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr = new int[a];
        //this is to take input of the array...c
        for(int i =0; i<a;i++){
            arr[i] = sc.nextInt();


        }
        System.out.print("Great..now tell how many steps...");
        int k = sc.nextInt();
        k = k % a;

        //step1: reverse the whole array
        rotate(arr, 0, arr.length -1);


        //step2: reverse from start to k part
        rotate(arr, 0, k-1);

        //step3: reverse from k to n-1 part...
        rotate(arr, k, arr.length-1);

        


        //this is to display the array...../,
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
            
        }
         sc.close();
    }
   

    }
