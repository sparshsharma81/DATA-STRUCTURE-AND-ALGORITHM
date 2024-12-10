import java.util.Scanner;
public class two-darray_9dec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of array");
        int a = sc.nextInt();
        System.out.println("Enter the coloumn of array");
        int b = sc.nextInt();
        int [][] arr = new INT[a][b];
        for(int i = 0;i<a;i++){
            for(int j = 0 ;j<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }


    }
}
