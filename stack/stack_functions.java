

public class stack_functions {
    public static class Stack{
        private int[]arr = new int[4];
        private int idx =-1;//this is basically a pointer which point towards index
        //we can also assign like private int idx =0;
        void push(int x){
           if(idx >=arr.length-1) System.out.println("Bhaii ...overflow ho gya");
           idx++;
          arr[idx] = x;
             
        }
        int peek(){
            if(idx<0) return -1;
            return arr[idx];
        }
        int pop(){
            //in java...by default the values are 0 in array////
            if(idx<0) return -1;
            int top = arr[idx];
            arr[idx] =0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx;i++){
                System.out.print(arr[i]+" ");
            }
        }
        int size(){
            return idx+1;
        }
        boolean isEmpty(){
            if (idx==-1) return true;
            return false;
        }
        boolean isFull(){
            if(idx == arr.length-1) return true;
            return false;
        }
        int capacity(){
            return arr.length;
        }

    }
    

    public static void main(String args[]){
        Stack s1 = new Stack();
        s1.push(2);
        s1.push(1);
        s1.push(3);
        s1.push(4);
        s1.display();
        System.out.println(s1.isFull());
        
        System.out.println();
        System.out.println(s1.peek());
        System.out.println("The size is:" + s1.size());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.display();
        System.out.println();
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        System.out.println("The capacity is: "+s1.capacity());


    }
    
}
