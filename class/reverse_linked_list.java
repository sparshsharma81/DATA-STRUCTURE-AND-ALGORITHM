class ListNode{
    int val;
    ListNode next;
   
    ListNode(int val){
        this.val = val;
        this.next = null;
        // this.prev = null;
    }
}
public class reverse_linked_list {
    public static ListNode reverse(ListNode headA){
        ListNode curr = headA;
        ListNode prev = null;

        //list = null,1,2,3,4,5,6,null
        //curr --- 1 
        //prev -- null

        while(curr!=null){
            ListNode nextTemp = curr.next; // next---2 ,curr ---1 , prev ---null

            curr.next = prev; //curr.next = 2, --this will reverse the current node pointer 
            prev = curr; // move prev to current node
            curr = nextTemp;//this will move the next node
        }
        return prev;

        

         

    }
    public static void main(String[] args) {
        //we need to reverse linked list
        ListNode headA = new ListNode(3);
         headA.next = new ListNode(7);
         headA.next.next = new ListNode(9);
         headA.next.next.next = new ListNode(19);
         headA.next.next.next.next = new ListNode(29);
         ListNode temp1 = headA.next.next.next.next;

         System.out.print("Original list:");
         ListNode temp21= headA;
         while(temp21!=null){
            System.out.print(temp21.val+" ");
            temp21 = temp21.next;
         }
         System.out.println();
         reverse(headA);
         ListNode temp = temp1;
         while (temp != null) {
             System.out.print(temp.val + " ");
             temp = temp.next;
         }
         System.out.println();
     }

    }

