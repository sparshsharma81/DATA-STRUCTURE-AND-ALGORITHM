import java.util.*;
public class remove_consecutive_subsequence1 {
    public static void main(String[] args) {
        //now in this question we need to remove the consecuence duplicate elements
        //1 2 2 3 10 10 10 4 4 4 5 7 7 2
        //the output should be 1 3 5 2
        // we have to do this using the stack approach

        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i] == st.peek()) {

                if(arr[i+1] != arr[i] || i == arr.length -1){
                    st.pop();
                }
            }
        }
        int[]res = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i] = st.pop();
        }
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
