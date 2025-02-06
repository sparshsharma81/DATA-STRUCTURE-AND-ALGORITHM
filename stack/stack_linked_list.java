// package DATA-STRUCTURE-AND-ALGORITHM.stack;

public class stack_linked_list {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static class Stack{
        Node head = null;
        int size =0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head==null) return -1;
            int x = head.val;
            head = head.next;
            return x;

        }
        int peek(){
            if(head==null) return -1;
            return head.val;
        }
        boolean isEmpty(){
            if(head == null) return true;
            return false;
        }
       int size(){
        return size;
       }
       void displayreverse(Node temp){
        // temp = head;
        if(temp == null) return;

        displayreverse(temp.next);
        System.out.print(temp.val+ " ");//this code will print the string in reverse order
        }
       
       

        void display(){
            Node temp = head;
            while(temp!=null){
                // System.out.println("The previous value is: " +(temp.prev==null?"null":temp.prev.data)+
                // "The current value is: " + (temp)+
                // "The next element is: " + (temp.next ==null?"null":temp.next));
                System.out.print(temp.val+" ");
                temp= temp.next;
            }
        }

    }
    public static void main(String args[]){
        //now we are implementing stack using linked list
        //there is no problem of size here...

        Stack s1 = new Stack();
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(6);
        s1.display();
        System.out.println("the top most element is: "+s1.peek());
        System.out.println("the stack is empty or not: "+s1.isEmpty());
        System.out.println("pop:"+s1.pop());
        s1.push(9);
        System.out.println("Pushing element");
        s1.display();
        System.out.println("printing the stack in reverse order...");
        s1.displayreverse(s1.head);

    }
    
}
