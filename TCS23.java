import java.util.*;

public class TCS23{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int fact = 1;
        int x = s.length();

        while(x>0){

            fact = fact * x;
            x--;

        }
        System.out.printf("The Permutations possible for String %s is: %d",s,fact);
        sc.close();
    }
}


