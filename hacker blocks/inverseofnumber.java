import java.util.*;

class inverseofnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Read the input number
        String b = Integer.toString(a);  // Convert the number to a string
        
        // Create an array to store the inverse (0-indexed)
        int[] inverse = new int[b.length()];
        
        // Iterate over each digit in the number
        for (int i = 0; i < b.length(); i++) {
            int digit = b.charAt(i) - '0';  // Convert the character to integer digit
            inverse[digit - 1] = i + 1;  // Place the position (1-indexed) in the correct spot
        }

        // Print the inverse as an integer
        StringBuilder result = new StringBuilder();
        for (int num : inverse) {
            result.append(num);
        }
        
        System.out.println(result.toString());
    }
}
