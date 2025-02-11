// package DATA-STRUCTURE-AND-ALGORITHM.class;

public class celebrity {
    static int isCelebrity(int[][]a, int b){
        for(int i=0;i<n;i++){
            boolean celebrity = true;
            for(int j=0;j<n;j++){
                if(i!=j){
                if(a[i][j] == 1 && a[j][i]==1){
                    celebrity = false;
                    break;
                }
            }
                if(celebrity){
                    return i;
                }
            }
            return -1; //koi celebrity nahi mila...
        }        
    }
    public static void main(String args){
        //a celebrity is a person who knows everyone and no one else knows him...
        int[][] arr = {
            {0,0,1,0},
            {0,0,1,0},
            {0,0,0,0},
            {0,0,1,0}};

            

            //so in this the main thing is.. if 2nd column of 1st row is 1 then 1st column of 2nd row should be 1



    }
    int result = isCelebrity(arr, arr.length);
    System.out.print(result);
    
}
