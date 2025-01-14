public class quick_sort2 {

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        //this is the code of the swapping...
    }
    static void display(int[]arr){
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
    static void quicksort(int[]arr,int left, int right){
        if(left<right){
            int pivot = quick_sort(arr, left, right);
       
        //now we apply quick sort on the left and right part of the array..
        quicksort(arr, left, pivot-1);
        quicksort(arr, pivot +1, right);
     }
    }
    static int quick_sort(int[]arr, int left , int right){
        int pivot = arr[right-1];
        int index = left -1; //here we assume that the index is -1 or simply not part of the array..

        for(int i=left;i<right;i++){
            if(arr[left] <pivot){
                swap(arr, left, right);
            }

            swap(arr, index+1, right);

        }
        return index+1;

    }
    public static void main(String[] args) {
        int[] arr= {3,9,5,7,11,6,4,2};
        quicksort(arr, 0, arr.length);
    }
}
