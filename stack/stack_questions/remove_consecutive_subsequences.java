// package stack_questions;

import java.util.*;

public class remove_consecutive_subsequences {
    public static int[] remove(int[]arr){
        int n = arr.length;
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<n;i++){
            if(s1.size()==0 || s1.peek()!=arr[i]){
                s1.push(arr[i]);
            }
            else if(arr[i] == s1.peek()){
            if(i==n-1 || arr[i]!=arr[i+1]){
                s1.pop();
            }
        }
        }
        int[] res = new int[s1.size()];
        int m = res.length;
        for(int i=m-1;i>=0;i--){
            res[i] = s1.pop();
        }
        return res;
    }


    
    public static void main(String[] args) {
        /*
         given a sequence of numbers. Remove all the consecutive subseqence of length greater than
         or equal to 2 that contains the same element/


         1 2 2 3 10 10 10 4 4 4 5 7 7 2
         then it will return 1 3 5 2
         because 2 are consecutive and number of 2 are greater than 2
         3 10 are consecutive and no. of consecutive 10 are greater than 2
         7 are consecuitve as number of 7 is 2 which is greater than or equal to 2..so they are removed...

         */
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] result  = remove(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] +" ");
        }
        //we can do this using the stack approach;;
        /*
         basically the main idea is first we push each elements into stack and if
         stack.peek() == arr[i] then we will remove the element
         
         */
    }
}

