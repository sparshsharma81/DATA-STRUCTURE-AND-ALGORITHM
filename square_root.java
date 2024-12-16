import java.util.*;
public class square_root {
    public static void main(String[] args) {
        //now we are finding the square root of a number.. if it is a perfect square. print its root else -1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double a = sc.nextInt();
        // System.out.println(Math.sqrt(32));
    //   double b = Math.sqrt(a);
    //    double d = Math.sqrt(32);
    //    System.out.println(Math.floor(a));
    //    System.out.println(Math.round(Math.floor(d)));
       
       if(Math.sqrt(a) != Math.floor(Math.sqrt(a))){
        System.out.println("-1");

       }
       else{
        System.out.println(Math.sqrt(a));
       }



    }
}
