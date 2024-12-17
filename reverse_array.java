import java.util.*;
//time complexicity --- O(n) --- here it is the best.... 
//space complexicity --- O(1) ---- here it is the best...

import javax.sound.sampled.SourceDataLine;
public class reverse_array {

    public static void main(String[] args) {
        //now we are reversing an array..
        Scanner sc = new Scanner(System.in);
        System.out.print("Great..///enter the size of array: ");
        int a = sc.nextInt();
        System.out.println("great///now enter the array///");
        int [] arr = new int[a];
        for(int i = 0 ; i<a;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length -1;

        while(start<end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] -arr[end] ;
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
        for(int i = 0; i<a;i++){
            System.out.printf("%d ",arr[i]);
        }
        
        sc.close();


    }
}
