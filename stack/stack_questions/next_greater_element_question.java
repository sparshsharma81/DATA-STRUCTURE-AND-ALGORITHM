import java.util.Stack;

public class next_greater_element_question {
   
        /*
         given a sereies of N daily price quotes for a stack, we need to calculate the span of the stock's price of all N days. 
         the span of the stock's price in on day is the maximum number of consecutive days (starting from taht day and going backwords)
         for which the stock price was less than or equal to the price of that day.
         
         */

    public static void main(String[] args) {
        int[] arr = {4,10,5,8,20,15,3,12};
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i=n-1;i>=0;i--){
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
