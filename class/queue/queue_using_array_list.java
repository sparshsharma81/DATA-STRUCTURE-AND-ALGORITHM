
// import javax.swing.plaf.synth.SynthOptionPaneUI;

//FIFO

class queue{
    private int front,rear,size;
    private int capacity;
    private int[] arr;

queue(int capacity){
    this.capacity = capacity;
    arr = new int[capacity];
    front = 0; //here is from removing
    rear = -1; //here is from inserting
    size = 0; //this is the size or capacity of the array...
}
void enqueue(int val){
    if(size == capacity){
        System.out.println("The size is full...");
        return;
    }

    //insertion me rear position pr insert hoga
    rear = (rear+1)%capacity; //index out of bound nahi dikayega isme...wrna vo front pr chala jayega
    arr[rear] = val;
    size++;
}
void dequeue_many(int number){
    if(number>size){
        System.out.println("unexpecting error.....");
    }
    for(int i=0;i<number;i++){
        dequeue();
    }
}
int dequeue(){
    //we are removing the rear element
    if(size ==0){
        System.out.println("The queue is empty");
        // return;
    }
    int remove_element = arr[front];
    front = (front+1)%capacity;//this will move front //this will insure that when it reaches the end..then it will again move to front....

    size--;
    return remove_element;
}
boolean isEmpty(){
    return (size==0);
}
boolean isFull(){
    return size == capacity;
}
int peek(){
    if(size ==0){
        System.out.println("the array is empty...");
        // return -1;
    }
    return arr[front];
}
void display(){
    // int top = front;
    // while(top!=rear){
    //     System.out.println(arr[front]);
    //     top++;
    // }
    for(int i=0;i<size;i++){
        System.out.print(arr[(front +i)%capacity] +" ");
    }
    System.out.println();
}

}

public class queue_using_array_list {
    public static void main(String[] args) {
        queue q1 = new queue(5);
        q1.enqueue(5);
        q1.enqueue(4);
        q1.enqueue(3);
        q1.enqueue(2);
        q1.enqueue(1);
        q1.display();
        System.out.println("Now checking that the queue is empty or not" + q1.isEmpty());
        System.out.println("Now checking that the queue is full or not " + q1.isFull());

        System.out.println("Now removing the front element");
        q1.dequeue();
        q1.display();
        System.out.println("Now inserting a element at rear");
        q1.enqueue(6);
        q1.display();

        System.out.println("Now checking that the queue is empty or not"+ q1.isEmpty());
        // q1.isEmpty();
        System.out.println("Now checking that the queue is full or not" + q1.isFull());
        // q1.isFull();

        System.out.println("Now deleting multiple elements");
        q1.dequeue_many(2);
        q1.display();


        
    }
}
