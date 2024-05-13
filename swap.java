import java.util.*;

class Swa{

     private int x;
     private int y;
    
    void get_data(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        x = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        y = sc.nextInt();
        System.out.println("The Numbers before swapping: "+x+" "+y);
        sc.close();

    }

    void calc_data(){
        x = x + y;
        y = x - y;
        x = x - y; 
        System.out.println("The Numbers after swapping: "+x+" "+y);
     
}
}
public class swap {
    public static void main(String[] args) {
    
        Swa obj = new Swa();

        obj.get_data();
        obj.calc_data();
    }
    
}