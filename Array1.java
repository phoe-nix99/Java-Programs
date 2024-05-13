import java.util.*;

class Hehe1{
    Scanner sc = new Scanner(System.in);
    int h[];

    Hehe1(int x){
        h = new int [x];
    }
    void get_data1(){

        for (int i=0;i<h.length;i++){
            System.out.println("Enter the values: ");
            h[i] = sc.nextInt();

        }
    }
    void reverse(){
        System.out.println("The reverse of the array is: ");

        for (int j=h.length-1;j>=0;j--) {
         
            System.out.print(h[j]);
        }
    }
}

public class Array1{

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int l = s.nextInt();
        Hehe1 obj = new Hehe1(l);
        obj.get_data1();
        obj.reverse();
    }
}