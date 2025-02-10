// package DATA-STRUCTURE-AND-ALGORITHM.stack.stack_order;

import java.util.Stack;

public class infix1 {
    public static void main(String[] args) {
        String str = "8-5+3*4/6";
        Stack<Integer>values = new Stack<>();
        Stack<Integer>op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                values.push(ch - '0');

            }
            else{
                while
            }
        }

    }
    
}
