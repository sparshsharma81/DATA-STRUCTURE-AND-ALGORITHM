import java.util.*;
public class zero_oneprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];

        for(int i= 0; i<k;i++){
            arr[i] = sc.nextInt();
        }
        
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
        //bload

        for(int i = 0;i<arr.length;i++){
            if(i<zeros){
               arr[i] =0;
               

                }
               
            
            //leetcode 278 , 35,33
            else{
                arr[i] = 1;
            }
            
        }
        
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        
    }
}
