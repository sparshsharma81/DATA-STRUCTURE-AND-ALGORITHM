// package DSA.DATA-STRUCTURE-AND-ALGORITHM.sort;

import java.util.Scanner;

public class selection_sort {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]) {
        //in selection sort -- we just find the minimum element and then keep it at first position ...first sorted position
        //selection sort ---basically we image that our array is in two sorted parts...
        //first is sorted and second is unsorted
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();

        }

        int n = a;
        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(arr[i], arr[smallestIndex]);
            // int temp = arr[i];
            // arr[i] = arr[smallestIndex];
            // arr[smallestIndex] = temp;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
