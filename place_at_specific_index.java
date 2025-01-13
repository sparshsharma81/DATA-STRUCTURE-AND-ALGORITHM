    public void rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // If the left element is negative, move left pointer to the right
            if (arr[left] < 0) {
                left++;
            }
            // If the right element is positive, move right pointer to the left
            else if (arr[right] >= 0) {
                right--;
            }
            // If left is positive and right is negative, swap them
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
public class place_at_specific_index {
//      static void swap(int[]arr , int a , int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }
//     static void partision(int[]arr, int low, int high){
//         int pivot = arr[high];
//         int index = low-1;
//         for(int i =low;i<high;i++){
//             if(arr[i]<pivot){
//                 index++;


//             }
//         }
//     }


   


    public static void main(String[] args) {

        //write the code to place the element at require position
        int[] arr = {1,2,3,5,6};
        // int target = 4;

        // int left = 0;
        // int right = arr.length-1;
        // while(left<=right){
        //     int mid = left + (right - low)/2;
        //     if(arr[mid])
        // }
        // int left = 0;
        // int right = arr.length-1;
        // while(left<=right){
            

        // }
        rearrange(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}

