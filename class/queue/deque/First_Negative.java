   import java.util.*;
   public class First_Negative {
 
 static List<Integer> FirstNegativeInteger1(int arr[], int k) {
        // write code here
        int n = arr.length;
        Deque<Integer>dq = new LinkedList<>();
        List<Integer>result = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //   if(arr[i]<0) dq.add(i);
        // }
        
        for(int i=0;i<n;i++){
            // result.add([dq.isEmpty()?0:dq.peekFirst()]);
            //this will add...
            // if(!dq.isEmpty() && dq.peekFirst()>i) result.add(0);
            if(!dq.isEmpty()&& dq.peekFirst()<i-k+1){
                // result.add(arr[i]);
                dq.pollFirst();
            }
            if(arr[i]<0){
                dq.add(i);
            }
            if(i<k-1) continue;
            if(!dq.isEmpty()){
                result.add(arr[dq.peekFirst()]);
            }
            else{
                result.add(0);
            }
            
            // dq.pollFirst();
            // if(dq.peekFirst()<i){
            //     dq.pollFirst();
            // }
            // if()
            
            // if(!dq.isEmpty() && dq.peekFirst()<=i-k){
            //     dq.pollFirst();
            // } //this will remove the useless index
            //  if (i < n && arr[i] < 0) {
            //     dq.addLast(i);
            // }
            
        }
        return result;
    }

    // Function to find the first negative integer in every window of size k
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Process the first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                dq.addLast(i);
            }
        }

        // Step 2: Process the remaining elements
        for (int i = k-1; i <= n; i++) {

            while(dq.peekFirst()<=i){
                result.add(dq.peekFirst());
            }
            dq.pollFirst();
            if(dq.peekFirst()>i){
                result.add(0);
            }

            // if(dq.peekFirst()<=i){
            //     result.add(dq.peekFirst());
            // }
            // else{
            //     result.add(0);
            //     dq.pollFirst();

            // }

            
            // // Add result for the current window
            // result.add(dq.isEmpty() ? 0 : arr[dq.peekFirst()]);

            // // Remove elements that are out of the current window
            // if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
            //     dq.pollFirst();
            // }

            // // Add current element to deque if it is negative
            // if (i < n && arr[i] < 0) {
            //     dq.addLast(i);
            // }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> result = FirstNegativeInteger(arr, k);
        System.out.println(result);
    }
}


