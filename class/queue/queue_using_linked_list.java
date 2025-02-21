class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        
    }
}
class queue{
    Node front,rear;
    int size = 0;


    void insert(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    void delete(){
        if(front == null){
            System.out.println("the queue is empty");
            return;
        }

        front = front.next;
        //in this case there is a exceptions that if the queue become empty--- then rear = null
        if(front == null){
            rear = null;
        }
        size--;

    }
    int size(){
        return size;
    }
    int peek(){
        return front.data;
    }
    void display(){
        if(front == null){
            System.out.println("The queue is empty..");

        }
        Node front1 = front;
        while(front1!=null){
            System.out.print(front1.data+" ");
            front1 = front1.next;
        }
    }
    
}
public class queue_using_linked_list {
    public static void main(String args[]){

        queue q1 = new queue();
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(5);
        q1.display();
        System.out.println();
        q1.delete();
        q1.display();
        System.out.println();
        q1.insert(9);
        q1.display();
    }
}
