import java.util.*;
public class hehe {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int fact = 1 ;
        sc.close();
        
        for (int i=1;i<=a;i++){

            fact = fact*i;

        }
        System.out.println("The value is: "+fact);

    }
    
}
