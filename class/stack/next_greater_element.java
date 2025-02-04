import java.util.*;

public class next_greater_element { //this question have different variations ...... 
    static int[] nextGreatElement(int[]arr){
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] =st.peek()
                
            }
        }
        return nge;

    }
    public static void main(String args[]){
        /*
         now we are writing the next greater element
         iterate from last to first element , so that we can store all the visited elements of array in stack
         
         once you encounter an empty stack, store -1 for that array element

         if the stack is not empty, then look for any greater element on the top of stack than arr[i], if not found, pop() the stack;

         push the current element into stack,

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

    }
    
}
