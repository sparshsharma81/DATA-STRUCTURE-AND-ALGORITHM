public class sliding_window{
    public static int sum2(int[]arr,int start,int end){
        int sum =0;
        while(start<end){
            sum+=arr[start];
            start++;
        }
        return sum;
    }
    public static void main(String args[]){
        int start =0;
        int k = 3;
        int sum =0;
        int[]arr = {1,3,-1,-3,5,3,6,7};
        for(int i=0;i<arr.length;i++){
            while(!(k>arr.length)){

            
            sum = Math.max(sum2(arr,start,k),sum);
            start++;
            k++;
            }
        }
        System.out.println(sum);
    }
}