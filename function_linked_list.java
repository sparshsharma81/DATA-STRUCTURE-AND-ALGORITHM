public class function_linked_list {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
           
        }
    }
      


       public static class linked_list{
            Node head = null;
            Node tail = null;
             void insertAtEnd(int val){
                Node temp = new Node(val);
                if(head == null){
                    head = temp;
                    tail = temp;
                    //this means that the list is empty;
                }
                else{
                    tail.next= temp;
                    tail = temp;
                }


            }
            void insertAtBeginning(int val){
                Node temp = new Node(val);
                if(head==null){
                    head=  temp;
                    tail = temp;
                }
                else{
                    temp.next = head;
                    head = temp;
                }
            }
            int size(Node temp){
                Node h = temp;
                int count =0;
                while(h!=null){
                    count++;
                    h = h.next;
                }
                return count;
            } //this function will return the size of the node...
    
    
            public void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
    
                }
            } //this code will display the linked list
    
            void insertAtindex(int index , int value){
                Node temp = new Node(value);
                Node p = head;
                if(index <0 || index>size(head)){
                    return;
                    //this means that it is out of bound;

                }

                if(index ==0){
                    insertAtBeginning(value);
                }
                else if(index == size(head)){
                    insertAtEnd(value);
                }
                
                else{
                    for(int i=1;i<index;i++){
                        p = p.next;
                        
                    }
                    temp.next = p.next;

                }
              p.next = temp;

            }

        
        }
       

    
    public static void main(String args[]){
        linked_list l1 = new linked_list();
        l1.insertAtBeginning(2);
        l1.display();
        l1.insertAtEnd(3);
        l1.insertAtindex(2, 1);
       l1.display();


    }
}
