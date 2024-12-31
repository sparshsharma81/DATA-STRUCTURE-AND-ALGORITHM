public class quick_sort1 {
    static void swap(int[] arr, int a , int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
static int partision(int[] arr , int low , int high){
    int pivot = arr[high];
    int index = low -1;
    for(int j = low; j<high;j++){
        if(arr[j]<pivot){
            index++;
            swap(arr,index,j);
        }
    }
    index++;
    swap(arr,index,high); //this will swap the pivot and place it in its right index...since we have assumed that the pivot is in last index
    return index;
}
static void quicksort(int[]arr , int low, int high){
    if(low<high){
        int pivot = partision(arr,low,high);


    //now we are doing the quick sort --- bascially the main idea is recurssion...
    quicksort(arr, low, pivot-1);
    quicksort(arr, pivot+1, high);
        
    }
}
static void display(int[] arr){
    for(int a : arr){
        System.out.print(a+" ");
    }
}
    public static void main(String[] args) {
        //now we are doing the quick sort algorithm....
        int[] arr = {4,2,7,8,9,3,1,6};
        display(arr);
        System.out.println("");
        System.out.println("Now after the quick sort the array is...");
        quicksort(arr,0, arr.length-1);
        System.out.print("Sorted array////");
        display(arr);


    }
}
