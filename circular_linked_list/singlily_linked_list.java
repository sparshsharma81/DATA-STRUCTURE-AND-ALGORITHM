// package DSA.DATA-STRUCTURE-AND-ALGORITHM.circular_linked_list;

public class singlily_linked_list {
    public static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class CircularLinkedList {
        public static void printCircularList(Node head) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
    
            Node temp = head;
        //     do {
        //         System.out.print(temp.data + " → ");
        //         temp = temp.next;
        //     } while (temp != head); // Stop when we reach the head again
    
        //     System.out.println("(back to head)");
        // }
        while(temp!=null){
            System.out.print(temp.data+" ");
        }
        }
        public static void main(String[] args) {
            // Creating a circular linked list: 10 → 20 → 30 → (back to head)
            Node head = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
    
            head.next = second;
            second.next = third;
            third.next = head; // Making it circular
    
            printCircularList(head); // Output: 10 → 20 → 30 → (back to head)
        }
    }
}
    
    
