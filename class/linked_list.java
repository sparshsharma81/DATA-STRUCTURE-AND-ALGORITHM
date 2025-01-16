
public class linked_list {
    class Node{
        int data;
        Node next;

        //constructor to initilize node with data..
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    linked_list(){
        this.head=  null;
    }
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make new node the head
            return;
        }

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert the new node at the end
        temp.next = newNode;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void delete(int value){
        if
    }

    
    public static void main(String[] args) {
        //linked list
        //pointers are known as next 
        /*
         doub lie linked list

         */
    
    }
}
