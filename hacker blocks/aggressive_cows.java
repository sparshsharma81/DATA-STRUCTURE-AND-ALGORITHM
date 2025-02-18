import java.util.*;
class aggressive_cows{
    static boolean isPossible(int[]arr, int cows, int minDistance){
        int n = arr.length;
        int lastStall = arr[0];
        int cnt = 1;
        
        for(int i=1;i<n;i++){
            if(arr[i] - lastStall>=minDistance){
                cnt++;
                lastStall = arr[i];
            }
        }
        return cnt>=cows;

    }
    static int binarySearch(int[]arr, int cows){
        int n = arr.length;
        Arrays.sort(arr);
        int low = arr[1] - arr[0];
        int high = arr[n-1] - arr[0];
        int ans = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPossible(arr,cows,mid)){
                ans = mid;
                low = mid+1;

            }
            else{
                high = mid -1;

            }
        }
        return ans;

    }
    public static void main(String args[]){
        //aggressiv cows
        /*
             You are given n stalls positioned at specific distances along a straight line.Your task is to place c cows in these stalls such that the minimum distance betweeany two cows is maximized.


            Input Format
            The first line contains two integers n (number of stalls) and c (number of cows).
            The second line contains n integers, x1, x2, …, xn, representing the positions of the stalls.

            Constraints
            2 ≤ n ≤ 105 (number of stalls)
            2 ≤ c ≤ n (number of cows)
            1 ≤ xi ≤ 109 (stall positions)
            xi are guaranteed to be unique.

            Output Format
            Output a single integer: the maximum minimum distance between any two cows.


            Sample Input
            5 3
            1 2 9 4 8
            Sample Output
            3
            Explanation
            The stalls are at positions [1, 2, 4, 8, 9] (sorted).. Placing the cows at positions [1, 4, 8] gives a minimum distance of 3,which is the maximum achievable.
                    */
                    Scanner sc = new Scanner(System.in);
		int stall = sc.nextInt();
		int cow = sc.nextInt();
		int[] arr = new int[stall];
		for(int i=0;i<stall;i++){
			arr[i] = sc.nextInt();
		}

            


        //binary search approach ---
        /*
         minimum possible distance = 0;
         maximum possible distance = nums[n-1] - nums[0] ----last - first


         basically we need to place the cows at certain position
         
         
         */

    }
}