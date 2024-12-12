import java.util.Scanner;

public class TicTackWinner {
      public static int isWinner(int[][] arr) {
        
      //row check hoga ye
      int row = arr.length;
    //   int column = arr[0].length;
        for (int i = 0; i < row; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] == 0 ) {
                return 0;
            }
            else if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] == 1){
                return 1;
            }
        }

       //column check hoga ye
        for (int j = 0; j < 3; j++) {
            if (arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j] && arr[0][j] == 0) {
                return 0; 
            }
            else if (arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j] && arr[0][j] == 1) {
                return 1;
            }
        }
//diagonal check hoga ye.....
//first diagonal...
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] == 0 ) {
            return 0; 
        }
        else if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] == 1 ){
            return 1;
        }

        //second diagonal check hoga ye..
        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] == 0 ) {
            return 0; 
        }
        else if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] == 1){
            return 1;
        }

        return 2; //matlab draw.....
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

        // System.out.println(arr[i][j]);
      


        if(isWinner(arr)==1){
            System.out.println("The winner is 1");

        }
        else if(isWinner(arr)==0){
            System.out.println("The winner is 0");
        }
        else{
            System.out.println("Draw");
        }
        // if (isWinner(arr)) {
        //     System.out.println("WE HAVE THE WINNER");
        // } else {
        //     System.out.println("ONCE MORE/....");
        // }

        sc.close();
    }
}


