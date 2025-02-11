// package DATA-STRUCTURE-AND-ALGORITHM.class.stack_conversion;
import java.util.*;
public class infix_to_prefix {
   
        /*
         steps...
         1.reverse the infix
         2.infix to postfix
         3.reverse that answer
         */

         static int precedence(char ch){
            if(ch =='+' || ch =='-'){
                return 1;
            }
            else if(ch == '*' || ch =='/'){
                return 2;
            }
            else if(ch =='^'){
                return 3;
            }
            return 0;
        }
        static boolean isOperator(char ch){
            return ch=='+' || ch =='-' || ch == '*' || ch =='/' || ch =='^';
            
        }
        static String InfixToPostFix(String s){
            StringBuilder sb = new StringBuilder();
            Stack<Character> op = new Stack<>();
    
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
    
                //master theorom
                
                if(Character.isDigit(ch)){
                    sb.append(ch);
    
                }
                else if(isOperator(ch)){
                    while (!op.isEmpty() && precedence(op.peek()) > precedence(ch)) {
                       sb.append(op.pop());
                    }
                    op.push(ch);
                }
                
    
            }
            while(!op.isEmpty()){
                    sb.append(op.pop());
                }
            return sb.toString();//ab basically stringbuilder ko return kar dege....
        }
        public static void main(String args[]){
            String infix = "3+5*2^3-6";
            /*
             so our basic approach of this is
             1.reverse the number
             2.then do the infix to postfix conversion..
             3.then again reverse the answer
             */
            // String postfix = InfixToPostFix(infix);\
            StringBuilder rev = new StringBuilder(infix).reverse();
            for(int i=0;i<rev.length();i++){
                if(rev.charAt(i) == '('){
                    rev.setCharAt(i,')');

                }
                else if(rev.charAt(i) == ')'){
                    rev.setCharAt(i,'(');
                }
            }
            //now we are doing infix to postfix conversion...
            String ans = InfixToPostFix(rev.toString());
            String answer = new StringBuilder(ans).reverse().toString();
            System.out.println(answer);



            // System.out.println(postfix);
            
            
        
    }
}
