import java.util.*;
public class inverse_number {
    static void swap(int[]arr,int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        String s = Integer.toString(a);
       
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
            }
        for(int i=0;i<a;i++){
            swap(arr, i, arr[i]);
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]);
        }
    }
}
