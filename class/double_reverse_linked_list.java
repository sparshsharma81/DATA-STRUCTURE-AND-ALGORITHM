
import java.util.LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode previ;
   
    ListNode(int val){
        this.val = val;
        this.next = null;
        this.previ = null;
        
        // this.prev = null;
    }
}
public class double_reverse_linked_list {
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        

        //list = null,1,2,3,4,5,6,null
        //curr --- 1 
        //prev -- null


        while(curr!=null){

            ListNode temp = curr.next;
            curr.next = curr.previ;
            curr.previ = temp;

            //now we are moving to the next node which is basically the previous node..
            prev = curr;
            curr = curr.previ;

          

           
        }
        return prev;

        

         

    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.previ = head;
        head.next.next = new ListNode(3);
        head.next.next.previ = head.next;
        head.next.next.next = new ListNode(4);
        head.next.next.next.previ = head.next.next;
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.previ = head.next.next.next;


       printList(head);
        printList(reverse(head));


        

    }
    
}
