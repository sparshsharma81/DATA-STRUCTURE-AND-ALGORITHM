package Deque_1;


// import javax.swing.text.DefaultEditorKit;
// package deque;

public class deque {
    
    private static class Node{ //we write this because they are accessible in package only...
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
       private  Node front;
      private  Node rear;
       private int size;


       deque(){
        front = null;
        rear = null;
        size =0;
       }
  //static is that which is same across each object...
  //if there is not static then it is copy again and again

        public  void insertAtRear(int data){
            Node temp = new Node(data);
            if(rear == null){  //this means that the queue is empty
                rear = front = temp;
            }
            else{
                // rear.prev = temp;
                // temp.next =rear;
                // rear.prev = null;
                // rear.next = temp.next;
                // rear =temp;
                // temp.next = rear;
                // rear.prev = temp;
                // rear = temp;
                rear.next = temp;
                temp.prev= rear;
                rear = temp;
            }
            size++;
        }
        public  void insertAtFront(int data){
            Node temp = new Node(data);
            if(front == null){
                front = rear = temp;
            }
            else{
               temp.next = front;
               front.prev = temp;
               front = temp;

            }
            size++;
        }
        public  void deleteAtrear(){
            if(rear == null) return;
            if(rear == front){
                //this is single element case;
                front = rear = null;
                size--;
            }
            else{     
            rear = rear.prev;
            rear.next = null;
            size--;
            }

        }
        public  void deleteAtfront(){
            if(front == null) return;
            if(front==rear){
                //this is the single element case;
                front = rear = null;
                size--;
            }
            else{
            front = front.next;
            front.prev = null;
             size--;
            }
            
           
        }
        
        public  int peekfront(){
            if(front == null) return -1;
            return front.data;
        }
        public  int peekrear(){
            if(rear == null) return -1;
            return rear.data;
        }
        public  boolean isEmpty(){
            return size==0;
        }
        public  int size(){
            return size;
        }
        public  void display(){
            Node temp = front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }
    }
    
    
