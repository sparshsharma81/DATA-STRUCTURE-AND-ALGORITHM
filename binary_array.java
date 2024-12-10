import java.util.*;

public class binary_array {
    public static void main(String[] args) {
        /*
         * we need to find the index where left , right, top, bottom values are 0''''
         * rest are 1
         * 
         * 
         */
        int i1 = 0;
        int j1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        for(int i = 0 ; i<row ; i++){
            for(int j = 0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // int [][] arr = {{0,1,1,0},{1,1,0,1},{0,1,1,0}};

        for(int i=1 ; i<row-1;i++){
            for(int j = 1;j<column-1;j++){
                if(arr[i][j-1]==arr[i][j+1]
                 && arr[i][j+1]==arr[i-1][j] 
                 && arr[i-1][j]== arr[i+1][j] 
                 && arr[i+1][j]== 1){
                    i1=i;
                    j1=j;
                    break;

            
        }
            }
            System.out.printf("ANSER: %d, %d",i1,j1);

        }

        
        
    }
    
}
