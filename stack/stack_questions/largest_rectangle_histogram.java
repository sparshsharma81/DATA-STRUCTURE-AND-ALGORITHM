import java.util.*;
public class largest_rectangle_histogram {
    public static void main(String args[]){
        /*
         given an array of integer heights representing the histogram's bar
         height where the width fo each bar is 1, return the area of the largest
         rectangle of histogram
         
         */

         /*
          so our main approach towards this is first finding the left smaller , then right smaller and then

          area = arr[i] * ( right_smaller - left_smaller - 1)


          input --- heights = [2,1,5,6,2,3]
          output --- 10
          */
          int[] height = {2,4};
          int n = height.length;
          int[] previous_smaller = new int[n];
          int[]next_smaller = new int[n];
          Stack<Integer>p1 = new Stack<>();
          Stack<Integer>n1 = new Stack<>();
          int result = 0;


/*
            we are finding the next smaller ... but here if we do not find the element,,then we will write n instead of -1;
 */



          //first we are finding the next smaller;
          for(int i = n-1;i>=0;i--){
            while(!n1.isEmpty() && height[n1.peek()]>=height[i]){
                n1.pop();
            }
                next_smaller[i] = n1.isEmpty()?n:n1.peek();
                n1.push(i);


          }

          //now we are finding the previous smaller element;
          for(int i=0;i<n;i++){
            while(!p1.isEmpty() && height[p1.peek()]>=height[i]){
                p1.pop();
            }
            previous_smaller[i] = p1.isEmpty()?-1:p1.peek();
            p1.push(i);
          }

          for(int i=0;i<n;i++){
           int width =(next_smaller[i] - previous_smaller[i] - 1) * height[i];
           result = Math.max(result,width);
          }

          System.out.println(result);




    }
}
