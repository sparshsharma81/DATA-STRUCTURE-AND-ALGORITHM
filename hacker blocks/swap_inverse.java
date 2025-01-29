public class swap_inverse {
    public static void main(String[] args) {
    
    int n = 32145;
    // int[] arr = {0,3,2,1,4,5}; // Example array
    int[] arr = {0,5,4,1,2,3};
    for (int i = 1; i < arr.length; i++) {
         // Ensure arr[i] is within bounds
            int temp = arr[i];
            arr[i] = arr[arr[i]];
            arr[temp] = temp;
        }
    
    // Print the modified array
   for(int i=1;i<arr.length;i++){
    System.out.print(arr[i]+" ");
   }

}
}
