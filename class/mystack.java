public class mystack {

    mystack(int size){
        int[] arr = new int[size];
    }

    public void push(int item){
        index++;
        arr[index] = item;
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty.");
        }
        return arr[index];
    }
    public int pop(){
        int top = arr[index];
        index--;
        return top;
    }
    public int size(){
        return index+1;
    }

    
    public boolean isFull(){
        return index+1
    }
    public static void main(String[] args) {
        
    }
}
