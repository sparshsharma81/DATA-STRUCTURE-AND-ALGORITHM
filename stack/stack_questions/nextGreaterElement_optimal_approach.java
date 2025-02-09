import java.util.*;
public class nextGreaterElement_optimal_approach {
    public static void main(String[] args) {
        //now this is the optimal approach ...
        // int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr = {1,3,2,1,8,6,3,4};
        Stack<Integer>s1 = new Stack<>();
        // int sum =0;
        int n = arr.length;
        int[] res = new int[arr.length];
        for(int i = n-1;i>=0;i--){
            while(!s1.isEmpty() && s1.peek()<=arr[i] ){
                s1.pop();
            }
            res[i] = s1.isEmpty()?-1:s1.peek();
            // sum+=arr[i];
            s1.push(arr[i]);

        }        
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
            
        }
        // System.out.printf("\n"+ sum);
    }
}


//the basic analogy of this is like there are buildings in a stack and they are arranged
/*
 this is similar to rain water harvesting 
 or next biggest buiding
 
 */