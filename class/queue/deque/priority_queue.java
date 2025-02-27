//leetcode 215
import java.util.PriorityQueue;

public class priority_queue {
    static int findKthLargest(int[]arr, int k){
        //by default , priority queue is minHeap; 
        //learn how to declare maxHeap 
         PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        int n = arr.length;
       
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            if(p1.size()>k){
                pq.remove();
            }
        }
        System.out.println(pq.peek());
    }
    public static void main(String args[]){
       int[] arr= {3,2,1,5,6,4};
        int k =2;
    }
}
