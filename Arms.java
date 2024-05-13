import java.util.*;


class Armstrong{

    private int x;

    void get_data(){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a value: ");
        x = sc.nextInt();
        sc.close();
    }

    void calcu(){
        int temp = x;
        int sum = 0;
        while (x!=0){
            int rem = x%10;
            sum = (rem*rem*rem)+sum;
            x=x/10;
        }
        if (temp==sum){
            System.out.println(sum+" is an Armstrong Number");
        }
        else{
            System.out.println(sum+" is not an Armstrong Number");
        }
    }

}

public class Arms {
    public static void main(String[] args) {
        
        Armstrong obj = new Armstrong();

        obj.get_data();
        obj.calcu();
    }    
}
