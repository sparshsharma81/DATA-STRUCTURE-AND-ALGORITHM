public class bubble_sort1 {
    static void swap(int[] arr, int a, int b){
       arr[a] = arr[a] + arr[b];
       arr[b] = arr[a] - arr[b] ;
       arr[a] = arr[a] - arr[b];
    }
    static void  bubblesort(int[] arr){
        int n = arr.length -1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                //now jo last wale elements hai vo apni correct position pe already sort ho rakhe hai .
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }

    }
    public static void main(String[] args) {
        //we call this bubble sort as 
        //after each itetation.. one of the largest element or one element is at its perfect position..
        //meaning one element is like a bubble and goes from one location to another...

        //so basic there are two for loops.../\/
        //one normal for loop and other for loop --- j < n -1;
        int arr[] = {7,4,3,5,9,2,1};
        bubblesort(arr);
        for(int a:arr){
            System.out.print(a + " ");
        }
        //we can also write j < n instead of j < n-i; as they both will work the same..
        //bubble sort --- largest element bubbles out at the end
    }
}
