import java.util.Scanner;

public class array_2d_9dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of array: ");
        int a = sc.nextInt();
        System.out.print("Enter the coloumn of array: ");
        int b = sc.nextInt();
        int sum = 0;
        int [][] arr = new int[a][b];
        for(int i = 0;i<a;i++){
            for(int j = 0 ;j<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<a;i++){
            for(int j = 0 ;j<b;j++){
                sum+= arr[i][j];
            }
        }
        System.out.println(sum);
      
      

    }
}
