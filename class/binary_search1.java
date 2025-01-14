public class binary_search1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8};
        int target = 8;
        int start = 0;
        int end = arr.length-1;
        boolean found = false;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid -1;

            }
            else if(arr[mid]<target){
                start = mid+1;

            }
            else{
                System.out.println(mid);
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Element not found");
        }


        
    }
}
