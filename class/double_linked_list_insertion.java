

public class double_linked_list_insertion {
    public static class LinkedList{
        int val;
        LinkedList prev;
        LinkedList next;

       LinkedList(int val){
            this.val = val;
            this.prev = null;
            this.next= null;
        }
    }
        public static void display(LinkedList head){
            LinkedList temp = head;
            while(temp!=null ){
                
                System.out.println("Previous value is: "+(temp.prev != null?temp.prev.val:"PAIDA TO HONE DE") + ", present value: "
                + temp.val + " Next value is: "+ (temp.next != null ? temp.next.val:"KHATAM") );
                temp = temp.next;
            }
        }
        public static void display_reverse(LinkedList tail){
            LinkedList temp = tail;

            while(temp!=null){
                
                System.out.println("Previous value is: "+(temp.prev != null?temp.prev.val:"PAIDA TO HONE DE") + ", present value: "
                + temp.val + " Next value is: "+ (temp.next != null ? temp.next.val:"KHATAM") );
                temp = temp.prev;
            }
        }
    public static void main(String args[]){
        LinkedList a = new LinkedList(4);
        LinkedList b = new LinkedList(2);
        LinkedList c = new LinkedList(1);
        LinkedList d= new LinkedList(12);
        a.prev = null;
        a.next = b;
        b.prev = a; 
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        display(a);
        System.out.println();
        display_reverse(d);



    }
    
}
