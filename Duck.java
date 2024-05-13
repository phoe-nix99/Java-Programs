import java.util.*;

public class Duck {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int x = sc.nextInt();
        int temp = x;
        int count = 0;

        while (x!=0){
            int rem = x % 10 ;

            if (rem==0){
                count++;
                break;
            }
            else {
                x = x / 10;
            }
        }
            if (count==1){
                System.out.println(temp+" is a duck number");
            }
            else{

                System.out.println(temp+" is not a duck number");
            }

        sc.close();
    }
}
    

