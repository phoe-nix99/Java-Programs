import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,2,1,3,4,1,3,2};

        int i = 0;
        int j = 1;
        int count = 0;

        for (int k = 2; k < arr.length; k++){

            if ( arr[i]+arr[k]==arr[j] ){

                count++;
            }
            i++;
            j++;
        }
        System.out.println(count);

    }

}