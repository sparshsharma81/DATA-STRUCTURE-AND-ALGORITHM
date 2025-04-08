
public class reverse_single_linked_list {

    public static Node reverse(Node head) {
        if (head.next == null) {
            return head;
        }
        Node temp = head;
        reverse(head.next);
        temp.next = head;
        return temp;

    }

    public static Node reverse1(Node head) {
        if (head.next == null) {
            return head;
        }
        head.next = reverse1(head.next);

    }

    public static Node reverse2(Node head) {
        if (head.next == null) {
            return head;
        }
        Node temp3 = head;
        while (temp3.next!= null) {
            t1.next = t;
            Node temp2 = t;

            t.next = t1;
            t1 = temp2;
            t = temp.next;
            temp3 = temp3.next;

        }

    }

    public static void main(String args[]) {

    }
}
