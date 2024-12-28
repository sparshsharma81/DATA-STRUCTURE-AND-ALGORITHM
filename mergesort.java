class mergeSort {
    
    public void mergeSort(int[] arr) {
        if (arr.length < 2) return;  // If array has 0 or 1 elements, it's already sorted

        int mid = arr.length / 2;  // Find the middle point of the array
        int[] left = new int[mid];  // Left part of the array
        int[] right = new int[arr.length - mid];  // Right part of the array
        
        // Split the array into two parts
        System.arraycopy(arr, 0, left, 0, mid);  // Copy the left half
        System.arraycopy(arr, mid, right, 0, arr.length - mid);  // Copy the right half
        
        // Sort both halves
        mergeSort(left);  // Recursively sort the left part
        mergeSort(right);  // Recursively sort the right part
        
        // Merge the sorted halves back together
        merge(arr, left, right);  // Merge the left and right parts
    }
    
    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Merge left and right arrays into arr[] while comparing each element
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];  // Add the smaller element from left to arr
            } else {
                arr[k++] = right[j++];  // Add the smaller element from right to arr
            }
        }
        
        // Add any remaining elements from left[]
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        // Add any remaining elements from right[]
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        mergeSort ms = new mergeSort();
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        ms.mergeSort(arr);  // Sort the array
        
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
