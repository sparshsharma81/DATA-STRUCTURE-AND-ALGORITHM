import java.util.*;
class inverse_of_number{
    static void swap(char[]arr,int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String str = Integer.toString(a);
        char[] arr = str.toCharArray();
        char[]arr2 = new char[arr.length];
       int left =0;
       int right = arr.length-1;
    //    while(left<right){
    //     swap(arr, left, right);
    //     left++;
    //     right--;
    //    }
        
    for(int i=0;i<arr.length;i++){
        arr2[i] = arr1[i];
    }
        // String b = Integer.toString(a);
      
       System.out.print(new String(arr))


    }
}