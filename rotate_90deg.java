import java.util.*;
public class rotate_90deg {
   
// Other imports go here, Do NOT change the class name


    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void action(int[][] arr) {
        // Transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse each row of the transposed matrix
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            reverse(arr[i]);
        }
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Number of test cases

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt(); // Size of matrix
            int[][] arr = new int[b][b];
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < b; k++) {
                    arr[j][k] = sc.nextInt();
                }
                
            }
            action(arr);
            display(arr);
            // Add a blank line between outputs of test cases
            if (i < a - 1) {
                System.out.println();
            }
        }
    }


}
