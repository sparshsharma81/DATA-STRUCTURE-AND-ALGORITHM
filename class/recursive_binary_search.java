public class recursive_binary_search {
    //this is called as recursive -binary search and there is one other method called as binary search..
    static boolean isBinarySearch(int[] a , int start,int end , int target){
        if(start>end){
            return false; //this is the case where the element is not found.....
        }   


        int mid = start + (end - start) /   2; //the (start+end)/2 may return error in somecases..so the other method is the best
        
        if(target < a[mid]){
           return isBinarySearch(a, start, mid-1, target); //left half
        }
        else if(a[mid] == target){
            return true; //this mean that the element is the middle one...
        }
        else{
            return isBinarySearch(a, mid+1, end, target);//right half
        }
        // return false;//this mean that the element is not present...
     
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        
        
        int target = 7;
        System.out.println(isBinarySearch(arr, 0, arr.length-1, target));
        //in this case the time-complexicity and space complexicity is O(logn)
        //meanwhile in other case , the 


        /*
         * Comparison:
            Method	                    Time Complexity	Space Complexity
            Recursive Binary Search	    O(log n)	    O(log n)    
            Iterative Binary Search	    O(log n)	    O(1)
         * 
         * 
         */

    }
}
