// package DATA-STRUCTURE-AND-ALGORITHM.class.queue.deque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sliding_window {
     public static List<Integer> firstNegativeInWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int n = arr.length;

        // Process first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(i); // Store index of negative number
            }
        }

        // Process remaining elements
        for (int i = k; i <= n; i++) {
            // Add first negative of the previous window
            result.add(queue.isEmpty() ? 0 : arr[queue.peek()]);

            // Remove elements out of the current window
            if (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.poll();
            }

            // Add current element if it is negative
            if (i < n && arr[i] < 0) {
                queue.add(i);
            }
        }

        return result;
    }
    public static void main(String args[]){
        
        
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> result = firstNegativeInWindow(arr, k);
        System.out.println(result);
    }
    
}
