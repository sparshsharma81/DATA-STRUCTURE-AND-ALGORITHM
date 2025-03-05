
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class interleave_queue {

    public static void main(String args[]) {
        /*we are given that the number of elements are even
        the array is 1 2 3 4 5 6 7 8
        output -- 1 5 2 6 3 7 4 8

        in the array we can do like n+=2 
        but here we have to solve this using the stack 

         */

        Stack<Integer> st = new Stack();
        /*
          so the logic behind this is that
          first we remove the first half of elements from the queue
          then we just store that in stack
          then we apped at the end in queue
          and then we store the second half of the queue in stack
          then we append each element simultaneously and removing from front and adding at back.



                Following are the steps to solve the problem: 



        Push the first half elements of the queue to stack. 

        Enqueue back the stack elements. 

        Dequeue the first half elements of the queue and enqueue them back. 

        Again push the first half elements into the stack. 

        Interleave the elements of queue and stack. 

         */

        Queue<Integer> q1 = new LinkedList<>();
        Queue


    }
}
