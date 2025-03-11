// package DATA-STRUCTURE-AND-ALGORITHM.class.cses Codes;
import java.util.*;
public class Missing_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr = new int[a-1];
        
 int realsum = 0;
        for(int i=0;i<a-1;i++){
            arr[i] = sc.nextInt();
            realsum+=arr[i];
        }
       
        int actual_sum = (a *(a+1))/2;
        // for(int i=0;i<a;i++){
            
        // }
       System.out.print(actual_sum - realsum);
    }
}
