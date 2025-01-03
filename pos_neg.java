public class pos_neg {
    static void swapping(int[] arr){
        int l = 0;
        int r = arr.length -1;
        while(l<=r){
            if(arr[l]>arr[r]){
                swap(arr,l,r);
                l++;
                

            }
            else{
               r--;
            }
        }
    }
    static void swap(int[]arr , int l , int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        //given a array consists of negative and positive integers...
        //we need to arrange it in such a way that all the negative and positive numbers are sorted///
        //we will do this using the quick sort method by assuming 0 to be pivot

        int[] arr= {19, -20 , 7 , -4 , -13 , 11, -5 , 3};
        //now in the output we want that it is to be sorted ... 
        swapping(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        
    }
}
