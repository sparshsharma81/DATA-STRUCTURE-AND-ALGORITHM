import java.util.Scanner;

public class minimum_index {
    public static void main(String[] args) {
        // int[] arr = {1,2,4,5,6,7};
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        System.out.println("Great..now enter the elements of the array/..");
        int [] arr = new int[a];
        for(int i = 0 ; i<a;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
       int min_index =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
                min_index = i;
            }

        }
        System.out.println(min_index);
    }
}
