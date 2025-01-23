// import java.util.*;
class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
public class intersection_of_linked_list {
      public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if(a==null || b==null) return null;

        while(a!=b){
            if(a==null){
                a = headB;

            }
            else{
                a=a.next;
            }
            if(b==null){
                b = headA;

            }
            else{
                b=b.next;
            }
           
        }
         return a;
    }
   
    
    public static void main(String[] args) {
        //here we are finding the intersection of two linked list
        // our main idea behind solving this question is that
        //we run two pointers nodes one on linked list1 and one on linked list2 
        //node a --- linkedlist a
        //node b --- linkedlist b
        /*
         suppose linedlist a is shorted
         when the node a is finished..then it will go to linked list 2
         when the node b is finished..then it will go to linked list1
         */
        /*
         ListNode a = headA;
         ListNode b =headB;

         while(a!=b){
         a = a == null? headB:a.next;
         b =b ==null>headA:b.next;
         }
         return a;
         */

         ListNode common = new ListNode(8);
         common.next = new ListNode(10);
         
         ListNode headA = new ListNode(3);
         headA.next = new ListNode(7);
         headA.next.next = common; // Merging point
 
         ListNode headB = new ListNode(99);
         headB.next = new ListNode(1);
         headB.next.next = common; // Merging point


         /*
          3--7 ---8 --10
          99---1---8---10 
         */


        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.val);
        } else {
            System.out.println("No Intersection");
        }
         
    }

}
