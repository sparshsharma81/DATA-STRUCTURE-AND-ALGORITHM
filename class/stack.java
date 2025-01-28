import java.util.Stack;
public class stack {
    public static void main(String args[]){
        /*
         peek--- only first book's cover page is visible
         pop()--- only first book can be taken out (if youre a good person);
         push()--- no book can be inserted in the middle of these books

         size()  , empty() , isempty() , search()

         package ---- ek folder hota hai jiske andar classes hoti hai
         */
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("Currennt size: "+ st.size()); //this will return the size of the stack
        System.out.println("Current Top Element is: "+ st.peek()); //this will return the top element
        System.out.println("Deleting top: "+st.pop()); //this will remove the top elment
        System.out.println("is Stack empty " + st.isEmpty()); //this will return true or false based on the stack is empty or not

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.out.println("is Stack empty " + st.isEmpty()); //this will return true or false based on the stack is empty or not




    }
}
