import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int a = 0, b = 1; // assign the default values

        System.out.println("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");

            // Compute the next term
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
