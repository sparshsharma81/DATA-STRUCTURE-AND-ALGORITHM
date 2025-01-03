public class fix_swap_index {
    static void arr(int[]arr){
        int n = arr.length;
        int x= -1, y = -1;
        if(n<1){
            return;
        }
        for(int i =1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                     x = i-1;
                }
               
                y = i;
            }
            
        }
        if(x!=-1 && y!=-1){
          int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;  
        }
    }
    // static void swap(int[] arr, int x, int y){
    // }
    public static void main(String[] args) {
        //now in this question we are given that in a array two numbers are swapped...
        //we need to reswap the numbers....
        int[] arr = {3,8,6,7,5,9,10};
        
       arr(arr);
       for(int i: arr){
        System.out.print(i+" ");
       }
    }
}
