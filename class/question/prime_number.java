import java.util.*;
public class prime_number {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.print(isPrime(a));
        int n  = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    //find number of prime number from 1 to n

}
