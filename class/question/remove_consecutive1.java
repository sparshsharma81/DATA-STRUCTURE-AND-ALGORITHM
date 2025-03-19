// package DSA.DATA-STRUCTURE-AND-ALGORITHM.class.question;

import java.util.*;

public class remove_consecutive1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" "); //hamne array of strings banaya...
        for(int i=1;i<words.length;i++){
            if(!words[i].equals(words[i-1])){
                res.append(" ").append(words[i]);

            }
        }
        String[] word2 = res.toString().split(" ");
        System.out.print(word2.length);


    }
    
}
