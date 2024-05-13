import java.util.*;

public class krishnamurthy {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int temp = a;
        int sum = 0;
        sc.close();



        while (a!=0){
            int b = a%10;
            int fact =1;
            for (int i=1;i<=b;i++){
                 fact = fact*i;
                }
            sum = sum + fact;
            a = a/10;

        }
      if (sum==temp){

        System.out.println("Krishnamurthy Number");

      }

      else {

        System.out.println("Not Krishnamurthy Number");
      }




    }
    
}
