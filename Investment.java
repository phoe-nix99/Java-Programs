// Investment.java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner; // Imported for UserInterface, but not directly used in Investment class

/**
 * The Investment class represents a single investment opportunity with a specific
 * number of shares, value per share, and company details.
 * It provides functionality to calculate the total investment amount when shares are bought,
 * and to manage the availability of shares.
 */
public class Investment {
    private int noOfShares; // Total number of shares available for this investment
    private double valueOfOneShare; // The value of a single share
    private int companyId; // Identifier for the company
    private String companyName; // Name of the company

    /**
     * Constructor for the Investment class.
     * Initializes a new Investment object with the specified details.
     *
     * @param noOfShares The initial total number of shares available.
     * @param valueOfOneShare The monetary value of one share.
     * @param companyId The unique identifier of the company.
     * @param companyName The name of the company.
     */
    public Investment(int noOfShares, double valueOfOneShare, int companyId, String companyName) {
        this.noOfShares = noOfShares;
        this.valueOfOneShare = valueOfOneShare;
        this.companyId = companyId;
        this.companyName = companyName;
    }

    /**
     * Getter method to retrieve the current number of available shares.
     * This is useful for displaying the remaining shares after a purchase.
     *
     * @return The current count of shares remaining for this investment.
     */
    public int getNoOfShares() {
        return noOfShares;
    }

    /**
     * Calculates the total amount of investment based on the number of shares to be bought.
     * This method first checks if the requested shares can be fulfilled.
     *
     * If the shares to be bought are greater than or equal to the currently available shares,
     * it prints "Shares not available" to the console and terminates the program
     * immediately as per the problem requirements.
     *
     * Otherwise (if sharesBought is strictly less than noOfShares), it reduces the
     * available shares, calculates the total investment amount, rounds it to one
     * decimal place, and returns this calculated amount.
     *
     * @param sharesBought The quantity of shares the user wishes to purchase.
     * @return The total investment amount rounded to one decimal place if shares are available.
     * Returns -1.0 (though unreachable due to program termination) if shares are not available.
     */
    public double calculateTotalAmountOfInvestment(int sharesBought) {
        // Check if the requested shares can be fulfilled.
        // Based on Sample Output 2, if 'sharesBought' is equal to 'noOfShares',
        // it is considered "Shares not available". This means the condition for
        // "not available" is 'sharesBought >= this.noOfShares'.
        if (sharesBought >= this.noOfShares) {
            System.out.println("Shares not available");
            System.exit(0); // Terminate the program immediately as required by the problem
            return -1.0; // This return statement is technically unreachable due to System.exit(0)
        } else {
            // Shares are available, proceed with the transaction
            this.noOfShares -= sharesBought; // Reduce the number of available shares

            // Calculate the total amount of investment
            double totalAmount = (double) sharesBought * this.valueOfOneShare;

            // Round off the total amount to one decimal value.
            // Using BigDecimal for precise floating-point arithmetic and reliable rounding.
            // Double.toString(totalAmount) is used to avoid potential precision issues
            // when converting a double to BigDecimal directly.
            BigDecimal bd = new BigDecimal(Double.toString(totalAmount));
            // Set the scale to 1 decimal place and use HALF_UP rounding mode (standard rounding,
            // where .5 rounds up).
            bd = bd.setScale(1, RoundingMode.HALF_UP);

            return bd.doubleValue(); // Return the rounded total investment amount
        }
    }
}


// UserInterface.java
// This class contains the main method to test the Investment application.
class UserInterface {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of company shares you bought");
        // Read the number of investment scenarios the user wants to simulate
        int numberOfInvestments = scanner.nextInt();

        // Loop through each investment scenario
        for (int i = 0; i < numberOfInvestments; i++) {
            System.out.println("Enter total number of shares");
            // Read the initial total number of shares available for the current company
            int initialNoOfShares = scanner.nextInt();

            System.out.println("Enter the company id");
            // Read the company ID
            int companyId = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character after reading int

            System.out.println("Enter the company name");
            // Read the company name
            String companyName = scanner.nextLine();

            System.out.println("Enter the number of shares you bought");
            // Read the number of shares the user intends to buy for this company
            int sharesBought = scanner.nextInt();

            System.out.println("Enter the value of one share");
            // Read the value of a single share for this company
            double valueOfOneShare = scanner.nextDouble();

            // Create an Investment object for the current company with its initial details
            Investment investment = new Investment(initialNoOfShares, valueOfOneShare, companyId, companyName);

            // Call the method to calculate the total amount of investment.
            // This method also handles the "Shares not available" condition and program termination.
            double totalAmountOfInvestment = investment.calculateTotalAmountOfInvestment(sharesBought);

            // If the program reaches this point, it means shares were available and the transaction was successful.
            // Print the details of the investment as per the sample output.
            System.out.println("Total number of shares=" + initialNoOfShares); // Display the initial shares for context
            System.out.println("Total amount of investment=" + totalAmountOfInvestment);
            System.out.println("Remaining Available shares=" + investment.getNoOfShares()); // Display updated remaining shares
        }

        // Close the scanner to release system resources
        scanner.close();
    }
}
