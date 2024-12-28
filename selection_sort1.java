public class selection_sort1 {
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void selection_sort(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min_index = i;
            for(int j = i+1;j<n;j++){
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }



            }
            swap(arr, min_index, i);
        }
       
    }
    public static void main(String[] args) {
        //now let us know about the selection sort...'
        //in selection sort we basically select a element and place it at its correct position...
        //like find the minimum element and place it in the starting or correct index

        int[] arr = {7,8,2,4,1,5,3,6};
        selection_sort(arr);
        for(int a:arr){
            System.out.print(a + " ");
        }


    }
}
