import java.util.Stack;

public class previous_greater_element1 {
    public static void main(String[] args) {
        int[] arr = {4,10,5,8,20,15,3,12};
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
