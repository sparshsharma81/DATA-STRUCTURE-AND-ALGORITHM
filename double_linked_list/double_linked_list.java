

public class double_linked_list {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    public static void displayLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println("Previous val is: " + (temp.prev!=null?temp.prev.data:" Null ") 
            + " And the current is: "+ (temp.data) +
             " And the next value is: " + (temp.next!=null?temp.next.data:"Null"));
             temp = temp.next;
        }
    }
    public static void displayrev(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp= temp.prev;
        }
    }
    public static void displayrandom(Node head){
        if(head==null){
            System.out.println("Bhai ye list khali hai.hai.");
            return;
        }
        
        Node temp = head;
        
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String args[]) {
        Node a = new Node(2);
        Node b = new Node(21);
        Node c= new Node(12);
        Node d = new Node(120);
        Node e = new Node(1212);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.prev = d;
        e.next = null;
        a.prev = null;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        displayLinkedList(a);
        System.out.println("And now other order is:..");
        display(a);
        System.out.println();

        displayrev(d);
        System.out.println();
        System.out.println("Random list ...");
        displayrandom(c);

    }
}
