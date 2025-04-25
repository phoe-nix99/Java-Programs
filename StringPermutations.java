import java.util.Scanner;

public class StringPermutations {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("\nPermutations of \"" + input + "\":");
        findPermutations(input, "");
        
        scanner.close();
    }
    
    // A simple recursive function to find permutations
    public static void findPermutations(String remaining, String current) {
        // Base case: no characters left to process
        if (remaining.length() == 0) {
            System.out.println(current);
            return;
        }
        
        // Try placing each character at the current position
        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            
            // Create new strings for the next recursive call
            String newCurrent = current + ch;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            
            // Recursive call with updated strings
            findPermutations(newRemaining, newCurrent);
        }
    }
} 