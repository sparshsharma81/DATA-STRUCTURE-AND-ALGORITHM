// package DSA.DATA-STRUCTURE-AND-ALGORITHM.class.question;

import java.util.*;

public class reverse_each_word {
   public static void main(String args[]) {
    


    //in this...we need to reverse each word..
    //input === i am reverse string ---
    //output i ma esrever gnirts

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println("String before length:"+s.length());
    // s = s.trim(); //it will trim left and right spaces..
    Stack<Character>st = new Stack<>();
    StringBuilder str= new StringBuilder();

    st.push(' ');
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch!=' '){
           st.push(ch); 
        }
       
       
        if(ch == ' ' || i==s.length()-1){
            while(!st.isEmpty()){
            str.append(st.pop());
        }
        st.push(' ');
         
        
        }
        
    }
    str.deleteCharAt(s.length());
    System.out.println(str);
    System.out.print("String after length: "+ str.length());

   }
}
