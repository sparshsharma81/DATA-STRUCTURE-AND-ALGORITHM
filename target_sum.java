import java.util.Scanner;
class target_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of array...: ");
       int n = sc.nextInt();
       System.out.print("Great...now enter the array...");
       int [] arr = new int[n];
       
       for(int i =0 ;i<n;i++){
        arr[i] = sc.nextInt();
       }
       System.out.print("Great...now enter the target sum...which you want to find: ");
       int b = sc.nextInt();
       for(int i = 0 ;i<n;i++){
        for(int j = i+1; j<n;j++){
            if(arr[i]+arr[j] == b){
                System.out.printf("%d , %d",i , j);    
            }

        }
       }

    }
}