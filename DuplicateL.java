import java.util.*;

class DuplicateL{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String hehe = sc.nextLine();
        char arr[] = hehe.toCharArray();
        int i = 0;
        int j = i+1;

        while (arr[i]==arr[j]){

            
            System.out.println("Duplicate found at index: "+i+" & "+j);

            i++;
            j++;


        }
       
    sc.close();

    }
}