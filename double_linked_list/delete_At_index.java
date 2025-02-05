public class delete_At_index {
    public static class Node{
        int data;
        Node prev = null;
        Node next = null;
        
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node insert_At_head(Node head,int x){
        Node temp = new Node(x);
        temp.next = head;
        head.prev = temp;
        head = temp;

        return head;

        
        
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
    public static void delete_index(Node head,int index){
        Node temp = head;
        if(index ==0){
            head = head.next;
            head.prev = null;
        }
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        if(temp.next==null){
            temp.prev = null;
            
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    public static void insertAtIndex(Node head, int val,int index){
        Node temp = new Node(val);
        Node s = head;
        if(head==null)return;
        for(int i=1;i<index;i++){
            s = s.next;

        }
        Node t = s.next;
        temp.prev = s;
        temp.next = t;
        t.prev = temp;
        s.next = temp;


    }
    public static void main(String[] args) {
        
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
       a = insert_At_head(a, 212);
       insertAtIndex(a, 199, 3);
       delete_index(a, 2);
        display(a);
        
    }
}
