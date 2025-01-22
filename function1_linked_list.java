public class function1_linked_list {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = next;
           
            
        }
        public static class LinkedList{
            Node head = null;
            Node tail = null;

            void insertAtFirst(int val){
            Node temp = new Node(val);
            if(head == null){
                //this means that the list is empty
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }

            
                

            }
            void insertAtEnd(int val){
                Node temp = new Node(val);
                if(head==null){
                    head = temp;
                    tail = temp;
                }
                else{
                    tail.next = temp;
                   
                } tail = temp;

            }
            void deleteAt(int index){
                if(head == null) return;

                Node temp = head;
                for(int i=1;i<index;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;

            }
            


        }
    }
    
}
