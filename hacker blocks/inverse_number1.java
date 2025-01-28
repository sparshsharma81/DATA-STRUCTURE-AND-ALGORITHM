import java.util.*;
public class inverse_number1 {
    public static void main(String[] args) {
        /*
         Take the following as input.
A number
Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.

Write a function that returns its inverse, where inverse is defined as follows

Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.

Print the value returned.


Input Format
Integer


Constraints
0 < N < 1000000000


Output Format
Integer


Sample Input
32145
Sample Output
12543
Explanation
Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number. Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
         */ 
        // Scanner sc= new Scanner(System.in);
        // int a = sc.nextInt();
        // int[] arr =new int[a+1];
        // // arr[0] = 0;
        // for(int i=0;i<a;i++){
        //     arr[i] = sc.nextInt();


        // }
        // int[]arr2 = new int[a+1];

        // // arr2[0] = 0;
        // for(int i=0;i<=a;i++){
        //     arr2[arr[i]] = arr[i]-1; //      

        // }
        // for(int i=0;i<a;i++){
        //     System.out.print(arr2[i]+" ");

        // }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int n = str.length();
        int[] inverse = new int[n];

        // Creating the inverse array
        for (int i = 0; i < n; i++) {
            int digit = str.charAt(i) - '0'; // Convert char to int
            inverse[digit - 1] = i + 1; // Place position at digit's index
        }

        // Print the inverse number
        for (int i = 0; i < n; i++) {
            System.out.print(inverse[i]);
        }



    }
}
