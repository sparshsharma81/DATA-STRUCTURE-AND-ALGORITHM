import java.util.Scanner;
public class insert_at_specific_element {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int a = sc.nextInt();
    int[] arr = new int[a];
    for (int i = 0; i < a; i++) {
        arr[i] = sc.nextInt();        
    }
    System.out.println("The array is...");
    for (int i = 0; i < a; i++) {
        System.out.print(arr[i]+" ");     
    }
    System.out.println("Great...now enter the position at which u want to insert the element..");
    int b = sc.nextInt();
    int[] arr2 = new int[a+1];
    for (int i = a; i >=0; i--) {
        arr[i] = arr2[i+1];        
    }


    for (int i = 0; i < a+1; i++) {
        System.out.print(arr2[i]+" ");     
    }
    
    sc.close();

    
 }   
}
///*
/// 
/// insertion sort
/// take first element of unsorted aarray and place it in sorted array at its correct position
/// here 5 will be shifted to right to index =1; and an empty space will be created at index = 0;
/// 
/// here 3 is at this index = 0;
/// 
/// now increase the size of sorted array- 0 and decrease the size of unsorted array by 1
/// 
///  */