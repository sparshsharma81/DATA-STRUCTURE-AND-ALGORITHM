import java.util.Scanner;

public class number_of_elements {
    public static void main(String args[]){
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        //Collections.sort(array) -- to sort the array
        
        int a = sc.nextInt();

        int[] arr = new int[a];
        
        for(int i = 0 ; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.print("The sum of array is : ");
        for(int i = 0 ; i<a; i++){
            if(arr[i] % 2 ==0 || arr[i]%5==0 || arr[i] % 10 == 0){
                sum+=arr[i];

        }
    }
    System.out.println(sum);
}
    
}

///java.util.star --- import everything
