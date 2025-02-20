class queue{
   int front,rear,size;
   int capacity;
   int[]arr;

   queue(int capacity){
    this.capacity = capacity;
    arr = new int[capacity];
    front = 0;
    rear = -1;
    size = 0;
    
   }
//now adding element in the queue ---this is called enqueu

    public void add(int val){
        if(rear == arr.length-1){
            System.out.println("bhai..kahi aur dekh le..aur capacity nahi hai");
            return;          
        }
        rear++;
        arr[rear] = val;
        size++;
    }

    public int delete(){
        if(size ==0){
            System.out.println("bhai..nikalne ke liye kuch hona bhi chahiye andar..");
            return -1;
        }
        int removed_element = arr[front];

        //now we are shifting all the elements left...
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];

        }
        rear--;
        size--;
        return removed_element;

    }

    public void print_queue(){
        if(size == 0){
            System.out.println("Bhai size to khali hai");
            return;
        }
        for(int i =0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }


    /*
     we always insert at the start of the queue
     front = -1;
     rear = -1;
     and we always insert at (r+1)th index;
     */
}
public class queue1 {
   
    public static void main(String args[]){
        //in case of queue--if we transfer things from one queue to another..then the things are transfer in the same way
        //meaning from one queue to another..we do not need to make an extra queue
        queue a = new queue(5);
        a.add(3);
        a.add(5);
        a.add(9);
        a.add(1);
        a.add(8);
        a.print_queue();
        System.out.println(a.delete());
        a.print_queue();
        a.add(4);
        a.print_queue();
    }
}
