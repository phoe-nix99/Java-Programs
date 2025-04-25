import java.util.*;

public class TCS2 {
    Scanner sc = new Scanner (System.in);
    int j = 1;
    void isEmpty(int n ){

        int [] arr = new int[n];

        for ( int h = 0 ; h < arr.length; h++){
            System.out.println("Enter the data: ");
            arr[h] =  sc.nextInt();
        }
        

        for (int i = 0; i < arr.length; i++){

            if (arr[i]==0){

                arr[j]=arr[i];
                j++;
            }
            else{
                System.out.println("0 Not Present");
            }
        }
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
        public static void main(String[] args) {

            TCS2 ob = new TCS2();
            ob.isEmpty(3);
        }
}
