public class Linked_list {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            // this.next = null;
        }


    }
    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    //printing linked list//./

public static void main(String[] args) {
    //in linked list---last node has null data type
    //the first pointer is known as head pointer
    Node a = new Node(2);
    Node b = new Node(1);
    Node c = new Node(12);
    Node d = new Node(121);
    a.next = b;
    b.next = c;
    c.next = d;
    // d.next = null;
    System.out.println(a.next.next.data);
    display(a);



}
}
