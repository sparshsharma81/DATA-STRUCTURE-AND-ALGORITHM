import java.util.*;
public class TIC_TAC_TOE {
    public static boolean isWinner(int[][] arr){
       //now checking the rows---
       for(int i =0;i<=2;i++){
        if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]){
            return true;
        }
       }
       //now we are checking the columns...
       for(int j= 0;j<=2;j++){
        if(arr[0][j] == arr[0][j+1] && arr[0][j+1] == arr[0][j+2]){
            return true;
        }
       }


       //now checking the diagonals...
      if(arr[0][0]==arr[1][1]&& arr[1][1] == arr[2][2]){
        return true;
      }
      if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]){
        return true;
      }
      

    }
    return false; //iska matlab draw ya no winner---
}
    //   if(arr[])
    //     for(int i = 0 ; i<=2;i++){
    //         for(int j = 0;j<=2;j++){
    //             if(arr[0][j]==arr[0][j+1]==arr[0][j+2]){
    //                 isWinner = true;
    //                 break;
    //             }
    //             else-if(arr[i][0]==arr[i+1][j] == arr[i+2][j]){
    //                 isWinner = true;
    //                 break;
    //             }
    //             else-if(arr[i][j] == arr[i+1][j+1] == arr[i+2][j+2]){
    //                 isWinner = true;
    //                 break;
    //             }
    //             else{
    //                 System.out.println("Draw");
    //             }

    //         }
    //     }


    // }import java.util.*;
// public class TIC_TAC_TOE {
//     public static int Winner(int i,boolean isWinner,int[3][3]arr){
//         isWinner = false;
//         for(int i = 0 ; i<=2;i++){
//             for(int j = 0;j<=2;j++){
//                 if(arr[0][j]==arr[0][j+1]==arr[0][j+2]){
//                     isWinner = true;
//                     break;
//                 }
//                 else-if(arr[i][0]==arr[i+1][j] == arr[i+2][j]){
//                     isWinner = true;
//                     break;
//                 }
//                 else-if(arr[i][j] == arr[i+1][j+1] == arr[i+2][j+2]){
//                     isWinner = true;
//                     break;
//                 }
//                 else{
//                     System.out.println("Draw");
//                 }

//             }
//         }


//     }
 

    public static void main(String[] args) {
        //we are creating a game of tic_tac_toe---
        int [][] arr = new int[3][3];

        for(int i = 0;i<=2;i++){
            for(int j = 0; j<=2;j++){

                arr[i][j] = sc.nextInt();
            }

        }
        if(isWinner(arr)){
            System.out.println("we have a winner");
        }
        else{
            System.out.println("Once more");
        }
        
        
    }

