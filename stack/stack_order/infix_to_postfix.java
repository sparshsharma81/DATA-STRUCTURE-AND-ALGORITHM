import java.util.Stack;

public class infix_to_postfix{

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
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
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
        String postfix = InfixToPostFix(infix);
        System.out.println(postfix);
        
        
        // 3523^*+6-
    }
}