import java.util.*;


public class swap_two_numbers {
//     static void swap(int &a , int &b){
//     a = a+b;
//     b = a - b;
//     a = a - b;
// }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Great//now the swapped number is : ");
        // swap(a,b);
        a = a + b;
        b = a - b;
        a = a- b;
        System.out.print(" a is : " + a +"and b is :" + b);

    }
}
