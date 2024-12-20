public class first_occurence_binary_search {
    static int firstOcc(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int result = -1; //this will store the index of the first occurence... by default if it is not present..it will output -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                result = mid;
                end = mid-1;


            }
            else if(arr[mid] > target){
                end = mid -1;


            }
            else {
                start = mid+1;
            }

        }
        return result; //this will return the index of the first occurence .. else return -1 if it is not present;


    }
    public static void main(String[] args) {
        int[] arr= {1,2,4,4,4,4,5,6,6,6,6};
        int target = 6;
        System.out.println(firstOcc(arr, target));

        
    }
}
