public class binary_search_problem {
    static boolean isTrue(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return true; 
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
            
        }
        return false;

        //time complexicity ---- O(log n);

    }
    static int firstocc(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return 1; 
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
            
        }
        return start;

        //time complexicity ---- O(log n);

    }
    public static void main(String[] args) {
        //this is the problem on binary search....
        //find the first occurance of given element x given that the array is sorted..if no occurance found
        //return -1
        int [] arr={2,3,4,6};
        int target = 5 ;
        System.out.println(firstocc(arr, target));
    }
}
