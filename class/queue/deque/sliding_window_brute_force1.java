
import java.util.*;

public class sliding_window_brute_force1 {
    // static ArrayList<Integer> d1(int[]num)
    public static void main(String[] args) {
        int[] arr= {-8, 2, 3, -6, 10};
        int k=2;
        int n=  arr.length;
        Deque<Integer>dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                dq.add(i);
            }
            if(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.removeFirst();
            }

            //window starts at i=k-1;
            if(i>=k-1){
                if(dq.isEmpty()) System.out.print(arr[0]+" ");
                else System.out.print(arr[dq.peekFirst()]+" ");
            }

        }
    }
}
