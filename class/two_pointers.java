import java.util.*;
public class two_pointers {
    public static void main(String[] args) {
        
    
    //to find the number of zeros and ones in a given array and sort them
    //this question can be done with using the two pointers approach
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int [] arr = new int[a];
    for(int i = 0; i<a; i++){
        arr[i] = sc.nextInt();
    }
    int start = 0;
    int end = arr.length -1;
    while(start<=end){
        if(arr[start] == 1 && arr[end] == 0 ){
           arr[start] = arr[start] + arr[end];
           arr[end] = arr[start] - arr[end];
           arr[start] = arr[start] - arr[end];
        }
        if(arr[start] == 0){
            start++;
        }
        if(arr[end] == 1){
            end--;
        }
    }
    for(int c: arr){
        System.out.print(c+" ");
    }
    
}
}