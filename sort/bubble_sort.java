// package DSA.DATA-STRUCTURE-AND-ALGORITHM.sort;
import java.util.*;
public class bubble_sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        } //this is array initilsation and insertion in array...

        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
