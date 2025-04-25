import java.util.*;

class Mystring{
    String name;
    int i;
    char rem;
    String hehe="";
    Mystring(String b){
        name = b;
        System.out.println("The given string is: "+name);
    }

    void rev(){
        System.out.print("The reverse of the string " +name+ " is: ");
        for (i=name.length()-1;i>=0;i--){
             rem = name.charAt(i);
             hehe = hehe + rem;
        }
        System.out.println(hehe);
      
    }

    void pali(){
        if (name.compareTo(hehe)==0){
            System.out.println("\nThe given string is Palindrome");
        }
        else{
            System.out.println("\nThe given string is not Palindrome");
        }
  }
  
 
}

public class Mystring1{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The String: ");
    String  g = sc.nextLine();
    Mystring ob = new Mystring(g);
    ob.rev();
    ob.pali();
    sc.close();
    

}

}