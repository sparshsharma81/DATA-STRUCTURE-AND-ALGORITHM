// package DATA-STRUCTURE-AND-ALGORITHM.stack.stack_order;

import java.util.*;


public class infix {


    static int precedence(char ch){
        if(ch =='+' || ch =='-'){
            return 1;
        }
        else if(ch == '*' || ch =='/'){
            return 2;
        }
        return 0;
    }

    static int apply(int a, int b , char ch){
        switch(ch){
            case '*' : return a*b;
            case '/' : return a/b;
            case '+' : return a+b;
            case '-' : return a-b;
        }
       //iska matlab aokat se bahar....
        return 0;
    }
    
    public static void main(String args[]){
        String str = "10-5+3*4/6";
        Stack<Integer>val = new Stack<>();
        Stack<Character>op = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // int ascii = (int)ch;
            // if(ascii>=48 && ascii<=57) val.push(ascii -48);


            if(Character.isDigit(ch)){
                val.push(ch - '0'); 
            }
            
            // else if(op.size()== 0) op.push(ch);
            else{
                
            //     if(ch=='*' || ch =='/'){
            //         int v2= val.pop();
            //         int v1 = val.pop();
            //         if(op.peek() == '*') val.push(v1*v2);
            //         if(op.peek()=='/') val.push(v1/v2);
            //         op.pop();
            //         op.push(ch);

            //     }
            //     if(ch == '+' || ch =='-'){
            //         int v2 = val.pop();
            //         int v1 = val.pop();
            //         if(op.peek() == '-') val.push(v1-v2);
            //         if(op.peek()=='+') val.push(v1+v2);
            //         if(op.peek() == '*') val.push(v1*v2);
            //         if(op.peek()=='/') val.push(v1/v2);
            //         op.pop();
            //         op.push(ch);
            //     }
            //     else op.push(ch);


            while(!op.isEmpty() && precedence(op.peek())>=precedence(ch)){
                int v2 = val.pop();
                int v1 = val.pop();
                char operation = op.pop();
                val.push(apply(v1,v2,operation));

            }
            op.push(ch); //issse current operation push ho jayega...
            }



        }
        // while(val.size()>1){ //this will treat 10 as 1 and 0 separate..so iski jagah hame !isEmpty use karna hoga.
        while(!op.isEmpty()){
            int v2 = val.pop();
            int v1 = val.pop();
            // if(op.peek() == '-') val.push(v1-v2);
            // if(op.peek()=='+') val.push(v1+v2);
            // if(op.peek() == '*') val.push(v1*v2);
            // if(op.peek()=='/') val.push(v1/v2);
            char operation = op.pop();
            val.push(apply(v1,v2,operation));
        }
        System.out.print(val.peek());
    }
    
}
