// package DSA.DATA-STRUCTURE-AND-ALGORITHM.class.cses Codes.repetition;

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int current =1;
        int max =1;
        for(int i=0;i<s.length()-1;i++){
            // char ch = s.charAt(i);
            if(s.charAt(i) == s.charAt(i+1)){
                current+=1;
                max = Math.max(current,max);
            }
            else{
                current = 1;
            }
        }
        System.out.print(max);
        sc.close();
    }
    
}
