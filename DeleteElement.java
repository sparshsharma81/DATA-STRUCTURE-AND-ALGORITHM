public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = 5; // Current size of the array
        int index = 2; // Index of the element to delete

        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            return;
        }

        // Shift elements to the left starting from the index
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--; // Reduce the logical size of the array

        // Print the updated array
        System.out.print("Array after deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
