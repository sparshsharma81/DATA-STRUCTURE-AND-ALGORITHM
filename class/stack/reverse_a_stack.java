import java.util.*;
public class reverse_a_stack {
    static Stack<Integer> reverseUsingAnotherStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(!st.empty()){
            temp.push(st.pop());
        }
        return temp;
        

    }
    public static void main(String arg[]){
        //if we want to save space we can you recurssion
        /*
         the optimized approach is 
         first pop each item from top and then insert at back each element
         
         */
      Stack <Integer> st = new Stack<>();
      Stack<Integer> reverseStack;
      st.push(12);
      st.push(2);
      st.push(1);
      st.push(9);



    }
    
}
