// package queue_questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {
    public static void main(String args[]){
        Queue<Integer>q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        Stack<Integer>s1 = new Stack<>();
        while(!q1.isEmpty()){
            s1.push(q1.poll());
        }
        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }
        System.out.println(q1);


    }
}
