public class nextGreaterElement {
    public static void main(String[] args) {
        //now we are solving the next greater element question,,
        /*
         basically it has 4 approach of solving

         it is similar to trapping rain water

         we are looking for the next greater element instead of smallest greater elenent
         ...so.. next greater element of 1 is supposed to be 3 not 2 

         */

         //brute force approach --- running loop inside loop
         //since in the brutal force approach ..we are using two loops...
         //so the time complexity is O(n^2) ---
         //and space complexicity is O(1)
         //and in these questions the next greater element of last one is always -1

         int[] arr = {1,3,2,1,8,6,3,4};
         int[] res = new int[arr.length];
         for(int i=0;i<arr.length;i++){
            res[i] = -1;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;

                }
            }
         }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
         System.out.println("The updated array is: ...");
         for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
         }
    }
}
