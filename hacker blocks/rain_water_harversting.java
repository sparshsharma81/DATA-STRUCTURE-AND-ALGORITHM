import java.util.*;
class rain_water_harvesting{
    public static void main(String args[]){
        //the main idea behind this is min(leftBuilding , rightBuilding) - arr[i]
        /*
         first we find the prefix sum
         then we will find the suffix sum
         
         */
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int[]arr = new int[a];

        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = new int[a];
        int[] suffixSum = new int[a];
        prefixSum[0] = arr[0];
        for(int i=1;i<a;i++){
            prefixSum[i] = Math.max(arr[i],prefixSum[i-1]);
            //this code will basically give the prefix sum...
        }
        suffixSum[a-1] = arr[a-1];

        for(int i=a-2;i>=0;i--){
            suffixSum[i] = Math.max(arr[i],suffixSum[i+1]);
        }
        //now we have both suffix max and prefix max
        //now for both loops ..the time complexicity --- O(2n);
        //we can optimize it just using suffix max
        //now the final is --- min(leftmax[i],rightmax[i]) - arr[i]
        int total =0;
        //we always need the smaller array..cause it is the building to which we can have water

        for(int i=0;i<a;i++){
            total+=(Math.min(prefixSum[i],suffixSum[i]) - arr[i])           ;


        }
        System.out.print(total);
    }
}