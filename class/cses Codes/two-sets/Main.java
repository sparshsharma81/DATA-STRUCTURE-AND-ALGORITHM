// package DSA.DATA-STRUCTURE-AND-ALGORITHM.class.cses Codes.two-sets;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        long s = sc.nextLong();
        long s2 = (s * (s+1))/2;
        if(s2 % 2 != 0) {
            System.out.println("NO");   
        }
        else{
            System.out.println("YES");
        }
    }
    
}
