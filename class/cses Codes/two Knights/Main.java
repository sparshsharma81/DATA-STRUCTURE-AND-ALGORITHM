// package DATA-STRUCTURE-AND-ALGORITHM.class.cses Codes;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         the total number of ways two nights can be placed in chess is 
         n*n ( n* n  -1) /2

         now two nights will attach each other if they are placed in l shapre or simply 2*3 or 3*2 position...
          4 (n-1) (n-2) 

          so in order to be safe ..total number of ways are 4(n -1)(n-2)
         */


         Scanner sc= new Scanner(System.in);
         long a =sc.nextLong();
        //  for(int i=0;i<a;i++){
        //     long n2 = (long) 4 * (a-1) * (a-2);
        //     long n = (long) a * a * ((a)*(a-1)) /2 ;
        //     System.out.println(n-n2);

        //  }
        for(long i=1;i<=a;i++){
            long n1 = 4 * (i -1) * (i-2);
            long n2 = (i * i) * (i* i -1 )/2;
            System.out.println(n2 - n1);

         

    }
}
    
}
