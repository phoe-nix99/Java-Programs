import java.util.*;
import java.util.Arrays;

class Ystring3{
    int i=0;
    int j;
    int count=0;

    void check2(String st1, String st2){

        char[] str1 = st1.toCharArray();
        char[] str2 = st2.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
    }

}



public class Mystring3{

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Ystring obj = new Ystring();
        System.out.println("Enter the first String: ");
        String b = sc.nextLine();
        System.out.println("Enter the second String: ");
        String j = sc.nextLine();
        obj.check2(b, j);


    }
    
}
