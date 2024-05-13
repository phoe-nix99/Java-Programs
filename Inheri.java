import java.util.*;
class Vehicle{

    String brand;
    int year;

    Vehicle(String b, int y){
     brand = b;
     year = y;
    }

    void display1(){

        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
    }
}

class Car extends Vehicle{
    String model;
    Car(String b, int y, String m ){

         super(b, y);
         model = m;

    }

    void display2(){

        System.out.println("Model: "+model);
    }

    }



public class Inheri {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand: ");
        String str = sc.nextLine();
        System.out.println("Enter Year: ");
        int z = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Model: ");
        String str2 = sc.nextLine();
        Car obj = new Car(str, z, str2);

        obj.display1();
        obj.display2();

    }
}
