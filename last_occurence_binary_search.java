public class last_occurence_binary_search {
    static int last_occurence(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int result = -1;
        while(start <=end){
            int mid = start + (end- start)/2;
            
            if(arr[mid] == target){
                result = mid;
                start = mid+1;

            }
            else if(arr[mid]> target){
                end = mid-1;
               
                
            }
            else{
                start = mid +1;

            }

        }
        return result;


    }
    public static void main(String[] args) {
        int [] arr = {5,6,6}; //this will start from 0
        int target = 6;
        System.out.println(last_occurence(arr, target));
       
    }
}
