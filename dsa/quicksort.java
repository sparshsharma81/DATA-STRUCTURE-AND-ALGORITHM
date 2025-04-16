public class quicksort{
    public static void quicksort1(int[]arr , int left , int right){
        if(left<right){
            int pivot = partision(arr,left,right);
            quicksort1(arr,left,pivot);
            quicksort1(arr,pivot+1,right);
        }
    }   
    public static int partision(int[]arr,int low,int high){
        int pivot = arr[high]; //we are choosing the last element as pivot
        int i = low- 1; //start;;;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;


    }
    public static void main(String args[]){

    }
}