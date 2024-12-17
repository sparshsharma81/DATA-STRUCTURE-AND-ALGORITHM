import java.util.*;
public class triplet {
    public static void main(String[] args) {
        //we are using this code to find the triplet..
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        System.out.print("Enter the array..");
        int[] arr= new int[a];

        
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i = 0; i<a;i++){
            for(int j = i+1; j<a;j++){
                for(int k = j+1; k<a;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.printf("%d %d %d ",i, j ,k);
                    }
                }
            }
        }


    }
}
