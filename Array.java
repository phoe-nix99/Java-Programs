import java.util.*;

class ArrayCheck{
    int x[];
    int j;
    int i;
    int size;
    ArrayCheck(int y){
    size = y;
    x = new int [size] ;    

    }

    void get_data(){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the values: ");

        for (i=0;i<size;i++){

            x[i] = sc.nextInt();

        }

    }

    void show_data(){

        for (i=0;i<size;i++){

            System.out.println("\nThe value at index "+ i +" is: "+x[i]);
        }

    }

    void search(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter an element to search: ");
        int t = sc.nextInt();
        for (i=0;i<size;i++){

                if (x[i]==t){

                    System.out.println("\nElement found at index: "+i);
                }
                else{
                    System.out.println("\nElement not Found!");
                }

        }

    }

    void max_min(){
        int m = x[0];
        int n = x[0];
        for (i=0;i<size;i++){

            if (x[i]>m){
                m = x[i];
            }
            if (x[i]<n){
                n = x[i];
            }

        }
        System.out.println("\nThe maximum element is: "+m);
        System.out.println("\nThe minimum element is: "+n);
    }

    void sort(){

        for (i=0;i<size-1;i++){
            for(j=0;j<size-1-i;j++){
                if(x[j]>x[j+1]){
                    int temp = x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for (i=0;i<size;i++){
            System.out.print(" "+x[i]);
        }

    }
}

public class Array {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size: ");
        int z = sc.nextInt();
        ArrayCheck obj = new ArrayCheck(z);
        while(true){
        System.out.println("\n1. Input Data\n2. Show Data\n3. Search for an element\n4. Find max or min \n5. Sort in Ascending order\n6. Exit");
        System.out.println("\nEnter your choice: ");
        int y = sc.nextInt();
        switch (y){

            case 1:
            obj.get_data();
            break;

            case 2:
            obj.show_data();
            break;

            case 3:
            obj.search();
            break;

            case 4:
            obj.max_min();
            break;

            case 5:
            obj.sort();
            break;

            case 6:
            System.exit(0);

            default:
            System.out.println("Wrong Choice");


        }
    }
}
}
