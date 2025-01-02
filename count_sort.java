public class count_sort{
    static int maxel(int[]arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void basiccount(int[] arr){
        int mx = maxel(arr);
        int[] count = new int[arr.length + 1];
        for(int i = 0;i<arr.length-1;i++){
            count[arr[i]]++;

        }
        int k = 0;
        for(int i = 0;i<count.length;i++){
            for(int j = 0;j<count[i]; j++){
                arr[k++] = i;
            }
        }

    }
    static void display(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        //now we are doing the count sort...
        /*
         basically in this... we count the max element in the array 
         and we see the index of the array from min to max

         and then we create a frequency array
         we will keep each element at that 
         and then we will output the final array
         
         */
        int[] arr = {1,6,3,4,1,2,1,4};
        display(arr);
        System.out.println(" ");
        basiccount(arr);
        display(arr);

    }
}