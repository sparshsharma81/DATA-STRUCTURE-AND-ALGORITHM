import java.util.*;
public class sliding_window_brute_forceliding_window{
    // static ArrayList<Integer> maxSubarray(int[]arr,int k){
        // int n =arr.length;
       public static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
            int n = arr.length;
    
            // to store the results
            ArrayList<Integer> res = new ArrayList<Integer>();
          
            for (int i = 0; i <= n - k; i++) {
          
              
                int max = arr[i]; //we store 1st element at 0th position at max;;;;
                for (int j = 1; j < k; j++) {
                    if (arr[i + j] > max)
                        max = arr[i + j];
                }
                res.add(max);
            }
          
            return res;
        }
    
    }
    public static void main(String args[]){
        //now here we are solving sliding window problem..,.
        //the brute force approach is using loops
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        ArrayList<Integer> res = maxOfSubarrays(arr, k);
        for (int maxVal : res) {
            System.out.print(maxVal + " ");
        }
    }
