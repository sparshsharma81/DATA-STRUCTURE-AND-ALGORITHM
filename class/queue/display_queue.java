import java.util.*;

public class display_queue {
    public static void main(String args[]){
        Queue<Integer>q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(5);
        q1.add(6);
        System.out.println(q1);
        
        //read ----> 6 5 5 4 3 2 1 <----front
        Queue<Integer>q2 = new LinkedList<>();
        while(!q1.isEmpty()){
            q2.add(q1.poll());
            // q1.poll();


        }
        while(!q2.isEmpty()){
            q1.add(q2.poll());

            //poll is similar to peek
        }
        

        System.out.println(q2);
    }
}
