public class sorted_array_target_sum {
    public static void main(String[] args) {
        //we are given a sorted arrya, find the index of target element..
        //linear search--- ek for loop chalate hai...similar to brute force approach..
        //time complexicity ---O(n);
        //in binary search--- we simply do like take three parts-==left , right and middle...
        //binary search works only one sorted array...
        //over-search space reduce at every index..
        ///leetcode 35 
        /// lower-bound --- index of a value in a sorted array that is greater than or equal to the target element
        /// upper bound ==== index of a value in a sorted array that is greater than the target element./// 
        //

        //in any loop-- max to max 10^6 times run kar sakta hai... 10^6 ka run ho sakta hai
        //everything has an max limit of 10^6

        /*
         * the basic concept of binary search--
         * int start = 0;
         * int end = arr.length-1
         * while(start<=end){
         * mid = (start+end)/2
         * ---now in order to avoid integer overflow---- mid = start + (end - start) /2 ---this prevent integer overflow..
         * if(arr[mid] > target){
         * end = mid -1;}
         * else-if(arr[mid]<target){
         * start = mid+1;}
         * else{
         * return mid}
         * 
         * }
         * 
         * 
         */
    }
}
