public class current{
    public static void main(String args[]){
        int[]arr = {1,2,3,1,1,1,7,9,7,1,1,1,1,1,1,8};
        int current =0;
        int max_count= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                current++;
                max_count = Math.max(max_count,current);
            }
            if(arr[i]!=1){
                 current =0;
            }
           
        }
        System.out.print(max_count);
    }
}