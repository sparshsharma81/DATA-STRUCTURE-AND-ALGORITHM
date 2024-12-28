
import java.util.Scanner;

public class merge_sort {
    static void combine(int[] arr, int left , int mid, int right){
        int n1 = mid - left +1;
        int n2 = right - mid;
        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];
        for(int i=0;i<n1;i++) leftarr[i] = arr[left+i];
        for(int j=0;j<n2;j++) rightarr[j] = arr[j + mid + 1];
        int leftidx =0;
        int rightidx = 0;
        int mainidx = left;
        while(leftidx<n1 && rightidx <n2){
            if(leftarr[leftidx] < rightarr[rightidx]){
                arr[mainidx++] = leftarr[leftidx++];
            }
            else{
                arr[mainidx++] = rightarr[rightidx++];
            }
        }
        while(leftidx<n1){
            arr[mainidx++] = leftarr[leftidx++];

        }
        while(rightidx< n2){
            arr[mainidx++] = rightarr[rightidx++];
        }




    }
    static void mergesort(int[] arr, int left , int right){
        if(left>=right){ 
            return;
        }
        else{  

        int mid = (left + right )/2;
        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);
        combine(arr,left,mid,right);
        }
    }
    static void display(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        System.out.print("Cool, now enter the array.. : ");
        int[] arr3 = new int[n2];

        for(int i =0;i<n2;i++){

            arr3[i] = sc.nextInt();
        }

        
        display(arr3);
        System.out.println("");
        System.out.println("Now after using the Merge-sort...");
        int n = arr3.length;
       ;

        mergesort(arr3,0,n-1);
        
        display(arr3);
    }
}
