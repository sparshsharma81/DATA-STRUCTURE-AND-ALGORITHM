// public class insert_element_at_given_index_9dec {
//     public static void main(String[] args) {
//now we are inserting a particular element at a specific index..
 //A = [1,2,3,4,5,6] ,,, index = 2, value = 8,
 // AFTER OPERATION ---- A = [1,2,8,3,4,5]
 //PSEUDO CODE --- 1>SHIFT ALL THE ELEMENT WITH INDEX GREATER THAN OR EQUAL TO INDEX BY 1;
 //PLACE THE NEW ELEMENT @INDEX = "INDEX";
//  int index = 2; //index at which the code is supposed to be inserted--
//  int element = 3;
//  int [] arr = {1,2,4,5,6,7};
//  for(int i = n-1; i>index; i--){
//     arr[i] = arr[i-1];
//  }
public class InsertElementInPlace {
    public static void main(String[] args) {
        int[] arr = new int[6]; // Allocate extra space
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5; // Current number of elements
        int index = 2; // Index where the new element should be inserted
        int element = 25; // Element to insert

        // Shift elements to the right starting from the end
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the new element
        arr[index] = element;

        // Print the updated array
        System.out.print("Array after insertion: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
   
