public class palindrome_linked_list {
   public static class Node {
        int data;
        Node next, prev;
    
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
  
        public static boolean isPalindrome(Node head) {
            if (head == null || head.next == null) return true; // Empty or single-node list is palindrome
    
            // Find the last node (tail)
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
    
            // Compare elements from start (head) and end (tail)
            Node left = head, right = tail;
            while (left != right && left.prev != right) {
                if (left.data != right.data) {
                    return false; // Not a palindrome
                }
                left = left.next;
                right = right.prev;
            }
            return true; // Palindrome
        }
    
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(1);
    
            // Connect backward links for doubly linked list
            head.next.prev = head;
            head.next.next.prev = head.next;
            head.next.next.next.prev = head.next.next;
    
            System.out.println(isPalindrome(head) ? "Palindrome" : "Not a palindrome");
        }
    }
    

