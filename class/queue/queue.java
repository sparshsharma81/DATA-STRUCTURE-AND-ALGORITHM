// package DATA-STRUCTURE-AND-ALGORITHM.class.queue;

import java.util.*;

public class queue {
    public static void main(String args[]){
        //insertion , deletion , front and other programs in queue
    
    // queue follows last in first out format
    //implementaion of queue using linked list

    // Queue<Integer>q1 = new LinkedList<>();
    /*
     there are three types of queue
     1.queue
     2.deque
     3.circular queue



     for using queue --we can do like 
     Queue<Integer>q1 = new LinkedList<>();
                    OR
    Queue<Integer>q1 = new ArrayList<>();

    //this queue is an interface ---here we can not create an object
    queue is an interface hence no object can be created..
     */
    Queue<Integer>q1 = new LinkedList<>();
    q1.add(3);
    q1.add(1);
    q1.add(2);
    System.out.println(q1);
    System.out.println(q1.peek());
    q1.remove();
    System.out.println(q1);
    //we can also write q1.poll() -- instead of remove;
    q1.poll();
    System.out.println(q1);
    System.out.println(q1.peek());


    /*
     types of operation in queue
     1.add
     2.remove()/poll()
     3.peek()/element()
     4.size()
     5.isEmpty()
     */

    
}
}


//priority queue --sorted elements --also known as heap --max heap and min heap --sliding window