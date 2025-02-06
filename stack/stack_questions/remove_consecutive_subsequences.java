// package stack_questions;

public class remove_consecutive_subsequences {
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
        int[] result  = new int[arr.length];
        Stack<Integer>s1 = new Stack<>();
        //we can do this using the stack approach;;
        /*
         basically the main idea is first we push each elements into stack and if
         stack.peek() == arr[i] then we will remove the element
         
         */
    }
    
}
