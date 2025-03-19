// package DSA.DATA-STRUCTURE-AND-ALGORITHM.class.question;
import java.util.*;

public class remove_consecutive {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        // Stack<String>st = new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     st.push(s.subString())
        // }

        System.out.print(s.replaceAll("\\b(\\w+)(\\s+\\1\\b)+", "$1"));
    }
}

