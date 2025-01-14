import java.util.Scanner;

public class TicTack {
    
  
    public static boolean isWinner(int[][] arr) {
        
      //row check hoga ye
      int row = arr.length;
      int column = arr[0].length;
        for (int i = 0; i < row; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] ) {
                return true;
            }
        }

       //column check hoga ye
        for (int j = 0; j < 3; j++) {
            if (arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j]) {
                return true; 
            }
        }
//diagonal check hoga ye.....
//first diagonal...
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] ) {
            return true; 
        }

        //second diagonal check hoga ye..
        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] ) {
            return true; 
        }

        return false; //matlab draw.....
    }

    public static void main(String args[]) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("INSERT THE values.....(1 for X, 2 for O):");

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

      
        if (isWinner(arr)) {
            System.out.println("WE HAVE THE WINNER");
        } else {
            System.out.println("ONCE MORE/....");
        }

        sc.close();
    }
}
