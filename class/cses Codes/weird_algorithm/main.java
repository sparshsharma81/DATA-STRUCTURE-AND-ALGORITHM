// package DSA.DATA-STRUCTURE-AND-ALGORITHM.class.cses Codes.weird_algorithm;
import java.util.*;
public class main {
    public static void main(String args[]){

    
    Scanner sc= new Scanner(System.in);
    long n =  sc.nextLong();

   // BigInteger b1 = new BigInteger(sc.next());
   while (n != 1) {
    System.out.print(n + " ");  // Print current value with space
    if (n % 2 == 0) {
        n /= 2;  // If even, divide by 2
    } else {
        n = 3 * n + 1;  // If odd, multiply by 3 and add 1
    }
}
System.out.print(n);  // Print final 1 without space after
}

}
