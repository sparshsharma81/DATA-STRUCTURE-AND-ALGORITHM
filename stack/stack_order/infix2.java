// package DATA-STRUCTURE-AND-ALGORITHM.stack.stack_order;
import java.util.*;
public class infix2 {
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
            case'^': return a^b;
            case '*' : return a*b;
            case '/' : return a/b;
            case '+' : return a+b;
            case '-' : return a-b;
        }
       //iska matlab aokat se bahar....
        return 0;
    }
    
    public static void main(String args[]){
        String str = "8-5+3*4/6";
        Stack<Integer>val = new Stack<>();
        Stack<Character>op = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
           

            if(Character.isDigit(ch)){
                val.push(ch - '0'); 
            }
            
           
            else{
             


            while(!op.isEmpty() && precedence(op.peek())>=precedence(ch)){
                int v2 = val.pop();
                int v1 = val.pop();
                char operation = op.pop();
                val.push(apply(v1,v2,operation));

            }
            op.push(ch);
            }



        }
        
        while(!op.isEmpty()){
            int v2 = val.pop();
            int v1 = val.pop();
           
            char operation = op.pop();
            val.push(apply(v1,v2,operation));
        }
        System.out.print(val.peek());
    }
    
}


