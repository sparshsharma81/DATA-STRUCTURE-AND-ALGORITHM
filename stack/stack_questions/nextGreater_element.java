import java.util.*;
public class nextGreater_element {
    public static void main(String[] args) {
        //now this is the optimal approach ...
        int[] arr = {1,3,2,1,8,6,3,4};
        Stack<Integer>s1 = new Stack<>();
        int n = arr.length;
        int[] res = new int[arr.length];
        for(int i = n-2;i>=0;i--){
            while(!s1.isEmpty() || s1.peek()<=arr[i] ){
                s1.pop();
            }
            res[i] = s1.isEmpty()?-1:s1.pop();
            s1.push(arr[i]);
        }        
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }
}