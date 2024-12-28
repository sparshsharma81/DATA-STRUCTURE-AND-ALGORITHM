public class question_sortion_algorithm{
    public static void main(String args[]){
        int[] arr = {0,0,0,0,42};
        //the question is that we need to move the zero's at the end without changing the order...
        // after the end of the iterations the array should be --- 5,3,42,0,0
        //now we are going to use bubble sort in this algorithm..
        int n = arr.length;
        for(int i =0; i<n-1;i++){
            for(int j =0 ;j<n-1-i;j++){
                if(arr[j] == 0 && arr[j+1]!=0){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];

                }

            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}