// package stack_questions;

import java.util.*;

public class balanced_brackets {
    public static boolean isBalanced(String str){
        if(str.isEmpty()) return false;
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch=='{' || ch=='['){

                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        //there are three types of brackets... round, curly and square
        /*
         like a string is given,,,
         String str = "()(()) --- i need to tell whether the brackets are balanced or not"
         String str2 = "(()()(" ---this is not balanced..so false

         

         BASIC APPROACH
         --IF THERE ARE OPENING BRACKET --THEN PUSH..
         AND IF THERE ARE CLOSING BRACKET..THEN POP THE PUSHED ELEMENT


         RULES ---
         1.OPENING BRACKET ---PUSH
         2.CLOSING 
         A.STACK TOP -- POP OUT OPENING BRACKET
         B.IF STACK IS EMPTY -- RETURN FALSE;
         */

         Scanner sc= new Scanner(System.in);
         String str = sc.next();
         System.out.print(isBalanced(str));


         //if we needed to find the minimum number of elements that are supposed to be removed in order make it balance
         //they we should return the size of stack
    }
}
