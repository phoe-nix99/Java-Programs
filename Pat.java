public class Pat {
    public static void main(String[] args) {
        int n = 3; // Number of rows

        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
