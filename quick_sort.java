// public class quick_sort {
//     static void swap(int[] arr , int left, int right){
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
//     }
//     static void display(int[] arr){
//         for(int i: arr){
//             System.out.print(i + " ");
//         }
//     }
//     static int quicksort(int[] arr , int left, int right){
//         if(left<right){
//             int pivot = quick_sort(arr,left,right);
//         }
//          //now we are doing quick sort on left;
//          quicksort(arr, left, pivot-1);
//          quicksort(arr, pivot ,right);
//     }
//     static void quick_sort(int[]arr , int begin, int end ){
//         int pivot = arr[end];
//         int index = begin -1; //here we choose -1

//         for (int i = begin; i < end; i++) {
//             if(arr[begin] < pivot){
//                 swap(arr,index,i);
//             }

            
//         }
//         swap(arr,index+1,end);
//     }
//     public static void main(String[] args) {
//         //in quick sort we basically select a pivot
//         int[] arr = {7,3,5,1,2,4,5,6};
//         display(arr);
//         System.out.println("Now after sorting...");
//         quicksort(arr, 0, arr.length-1);


//     }
// }
