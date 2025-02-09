import java.util.Stack;

public class previous_smaller_element {
    public static void main(String[] args) {
        //now we are finding the preivous smaller element...
        //input ---- 4, 10, 5, 8, 20, 15, 3, 12 
        //output - --- -1 4 4 5 8 8 -1 3

        int[] arr = {4,10,5,8,20,15,3,12};
        int[] result = new int[arr.length];
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
           while(!st.isEmpty() && st.peek()>=arr[i]){
            st.pop();
           }
           result[i] = st.isEmpty()?-1:st.peek();
           st.push(arr[i]);
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }



    }
}
