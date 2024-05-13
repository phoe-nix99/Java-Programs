import java.util.*;

class ArrayCheck5{
    int x[];
    int j;
    int i;
    int size;
    ArrayCheck5(int y){
    size = y;
    x = new int [size] ;    

    }
    void get_data1(){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the values: ");

        for (i=0;i<size;i++){

            x[i] = sc.nextInt();

        }

    }

    void show_data1(){

        for (i=0;i<size;i++){

            System.out.println("\nThe value at index "+ i +" is: "+x[i]);
        }

    }

 
}

public class Array3 {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int b = sc.nextInt();
        ArrayCheck5 obj2 = new ArrayCheck5(b);
        obj2.get_data1();
        obj2.show_data1();
    }
}
