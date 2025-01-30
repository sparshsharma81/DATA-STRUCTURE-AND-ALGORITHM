public class Find_intersection {
    

        public static Node findIntersection(Node head1, Node head2) {
            int length1 = getLength(head1);
            int length2 = getLength(head2);
    
            int diff = Math.abs(length1 - length2);
    
            if (length1 > length2) {
                head1 = moveForward(head1, diff);
            } else {
                head2 = moveForward(head2, diff);
            }
    
            while (head1 != null && head2 != null) {
                // For Class Question
                if(head1.data == head2.data){
                    return head1;
                }
    
                /* For leetcode
                if (head1 == head2) {
                    return head1; 
                } */
                head1 = head1.next;
                head2 = head2.next;
            }
    
            return null; // No intersection
        }
    
        // Get length of the List
        private static int getLength(Node head) {
            int length = 0;
            while (head != null) {
                length++;
                head = head.next;
            }
            return length;
        }
    
        // Move diff steps forward
        private static Node moveForward(Node head, int steps) {
            while (steps > 0 && head != null) {
                head = head.next;
                steps--;
            }
            return head;
        }
    
        public static void main(String[] args) {
            // Create two linked lists
            LinkedList list1 = new LinkedList();
            list1.insertAtEnd(10);
            list1.insertAtEnd(20);
            list1.insertAtEnd(30);
            list1.insertAtEnd(40);
            list1.insertAtEnd(50);
    
            LinkedList list2 = new LinkedList();
            list2.insertAtEnd(15);
            list2.insertAtEnd(25);
            
            // Create an intersection point
            Node intersectNode = list1.getHead().next.next; // 30 from list1
            /* NOTE: As we've linked node 30, all next nodes will be automatically added to this node */
            
            list2.getHead().next.next = intersectNode; // Make list2 intersect at node with value 30
    
            // Find intersection
            Node intersection = findIntersection(list1.getHead(), list2.getHead());
            if (intersection != null) {
                System.out.println("Intersection at node with data: " + intersection.data);
            } else {
                System.out.println("No intersection.");
            }
        }
    
}
