import java.util.Arrays; // Needed for Arrays.sort()
import java.util.Scanner; // Needed for reading user input

public class AutomateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize scanner once

        System.out.println("Enter the array size");
        int n = sc.nextInt(); // Read the array size

        // Validate array size: Must be greater than zero
        if (n <= 0) {
            System.out.println(n + " is an invalid array size");
            sc.close(); // Close scanner before terminating
            return; // Exit the program
        }

        int[] arr = new int[n]; // Declare the array after validating size

        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element
            // Validate array element: Must be non-negative
            if (arr[i] < 0) {
                System.out.println(arr[i] + " is an invalid element");
                sc.close(); // Close scanner before terminating
                return; // Exit the program
            }
        }

        System.out.println("Enter the target sum value");
        int z = sc.nextInt(); // Read the target sum value

        // Sort the array as required
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("The sorted array is");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + (j == n - 1 ? "" : " ")); // Print space unless it's the last element
        }
        System.out.println(); // Move to the next line after printing the array

        System.out.println("Pairs with sum " + z); // Print header for pairs once

        boolean foundPair = false; // Flag to track if any pair is found

        // Two-pointer approach to find pairs
        int left = 0;             // Start pointer from the beginning
        int right = arr.length - 1; // End pointer from the end

        while (left < right) {
            int currentSum = arr[left] + arr[right]; // Calculate the sum of current pointers

            if (currentSum == z) {
                // If sum matches target, print the pair in the desired format
                System.out.println(arr[left] + " + " + arr[right] + " = " + z);
                foundPair = true; // Mark that a pair has been found
                left++;           // Move left pointer to the right
                right--;          // Move right pointer to the left
            } else if (currentSum < z) {
                // If sum is too small, increase left pointer to get a larger sum
                left++;
            } else { // currentSum > z
                // If sum is too large, decrease right pointer to get a smaller sum
                right--;
            }
        }

        // After checking all pairs, if no pair was found, print the specific message
        if (!foundPair) {
            System.out.println("None of the pair has the sum value as " + z);
        }

        sc.close(); // Close the scanner to release resources
    }
}