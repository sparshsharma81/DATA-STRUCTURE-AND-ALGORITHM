import java.util.*;
public class infixToprefix {
    public static int precedence(char ch){
        if(ch=='*' || ch =='/') return 2;
        if(ch == '+' || ch =='-') return 1;
        if(ch =='^') return 3; //highest precedence
        return 0;
    }
    public static boolean isCharacter(char ch){
        return ch =='*' || ch =='-'|| ch =='+' || ch =='/' || ch =='^';
    }
    public static String infixToPostfixConvert(String s){
        StringBuilder result = new StringBuilder();
        // Stack<Integer>st = new Stack<>();
        Stack<Character>op= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                result.append(ch);
            }
            //first if the character is a letter ..then append it;;
            else if(isCharacter(ch)){
                while(!op.isEmpty() && precedence(op.peek()) >= precedence(ch)){
                    result.append(op.pop());
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()){
            result.append(op.pop());

        } 
        return result.toString();
        //this is basic infix to postfix conversion
    }
    public static String reverse(String s){
        StringBuilder st = new StringBuilder(s);
        return st.reverse().toString();
    }
    public static void main(String args[]){
        String infix = "3+5*2^3-6";
        String postfix =infixToPostfixConvert(infix);
        System.out.println(postfix);
        System.out.print(reverse(postfix));
               

    }
}
