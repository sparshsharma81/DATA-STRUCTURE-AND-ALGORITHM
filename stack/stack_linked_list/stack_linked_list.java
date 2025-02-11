
import java.util.Stack;

// package DATA-STRUCTURE-AND-ALGORITHM.stack.stack_linked_list;

public class stack_linked_list {
   static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
            
        }
      
    }
   static Node head;

    static class LinkedListusingstack{
        Stack<Node>list = new Stack<>();
        Node head = null;

        void insert(int val){
            /*
             basically our logic iz...
             we create a new node..
             then the next of the new node iz head
             then head become temp
             and in single linked list..we can not access the before element...
             */
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            list.push(temp);
        }
        void pop(){
            if(head ==null){
                System.out.println("Bhai stack to khali hai....");
                return; //get lost...
            }
            Node remove = list.pop(); ///basically ek remove naam ka node banaya..fir usme head ko daal diya
            head = remove.next; //fir head ko reassign kar diya
        }
        int peek(){
           if(list.isEmpty()){
            System.out.println("bhai...value to daal de stack me...");
           }
            
            return (list.peek().val);
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        void isEmpty(){
            if(list.isEmpty()){
                System.out.println("false");
            }
            return;
        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;

            }
            return count;
        }
        int search(int value){
            Node temp = head;
            int i = 1;
            while(temp!=null){
                if(temp.val == value){
                    return i;
                }
                
                i++;
                temp = temp.next;
            }
            return -1;
        }
    }
    public static void main(String args[]){
        LinkedListusingstack l1 = new LinkedListusingstack();

        System.out.print("Now our stack is empty....,we are poping element: ");
        l1.pop();

        System.out.print("Now let us check the list is empty or not...");
       l1.isEmpty();

       

        // System.out.println();
        System.out.println("The size is :" + l1.size());
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(43);
        System.out.print("Now displaying...");
        l1.display();
        System.out.println("NOW we pop the head ");
        l1.pop();
        // l1.pop();
        System.out.print("The stack is: ");
        l1.display();
        System.out.println();

        System.out.println("The top element is: " + l1.peek());
        // l1.peek();

        System.out.println("Now element 3 is at : " + l1.search(3));


        System.out.println("The size is: " + l1.size());
        // l1.size();



    }
    
}
