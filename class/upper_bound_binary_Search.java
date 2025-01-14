public class upper_bound_binary_Search {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,5,5,6};
        int target = 5;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] >= target){
                mid = right-1;

            }
            else if(arr[mid] <=target){
                mid = left +1;


            }
            else{
                    

            }
        }
    }
}
