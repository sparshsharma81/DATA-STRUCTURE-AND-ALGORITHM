public class lower_bound_binary_Search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5,6};
        int target = 4;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>= target){
                end = mid -1;
            }
            else {
                start = mid+1;
            }
            
        }
        System.out.println(start); //this will return the lower bound;;;;
    }
}
