// package DSA.DATA-STRUCTURE-AND-ALGORITHM.sort;

public class insertion_sort {
    public static void main(String args[])
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        } //this is array initilsation and insertion in array...

        
//in insertion sort we divide the array into two parts...sorted and unsorted part
//example --- 7 8 3 1 2 
/*
 like in first loop ---
 7 8   3 1 2 
 3 7 8   1 2
 */

 for(int i=0;i<a;i++){
    int current = arr[i];
    int j= i-1;
    while(j>0 && arr[current] < arr[j]){
        arr[j+1] == arr[j]
    }
 }

        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }

    
    
}
