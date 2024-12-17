import java.util.*;
public class zero_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        input.array(k);
        int[] arr = new int[k];
        int zeros = 0;
        int onces = 0;
        for(int i = 0;i<k;i++){
            if(arr[i] == 0){
                zeros++;

            }
            else{
                onces++;
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(i<=zeros){
                swap.swap(arr[i], 0);
            }
            //leetcode 278 , 35,33
            else{
                arr[i] = 1;
            }
            
        }
        
        output.arr_output(arr);

        
    }
}
