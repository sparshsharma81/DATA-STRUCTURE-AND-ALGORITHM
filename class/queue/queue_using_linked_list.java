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

    void insert(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
}
public class queue_using_linked_list {
    public static void main(String args[]){

        
    }
}
