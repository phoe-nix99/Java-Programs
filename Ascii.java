import java.util.*;

public class Ascii {
     char b[] = new char[10];
     static int f = 0;
              public static void main(String[] args) {
                  @SuppressWarnings("resource")
                 Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the String: ");
                  String a = sc.nextLine();
                  char [] b = a.toCharArray();
                  for (int i = 0;i < b.length; i ++){
     
                     char c = b[i];
                     int assci = c;
                     f += assci;

                System.out.println("The element at index "+i+" is:"+b[i]);
                System.out.println("The ASCII value at index "+i+" is:"+assci);
               
             }
             System.out.println("The sum of the letters are: "+f);

    }
    
}