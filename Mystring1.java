import java.util.*;

class Mystring{
    Scanner sc = new Scanner(System.in);
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

    void palli(){
        if (name.compareTo(hehe)==0){
            System.out.println("\nThe given string is Pallindrome");
        }
        else{
            System.out.println("\nThe given string is not Pallindrome");
        }
  }

  void check(String r, String l){

    for (int u=0;u<r.length();u++){

        for (int z=0;z<l.length();z++){

            
        }
    } 

  }
 
}

public class Mystring1{

public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The String: ");
    String  g = sc.nextLine();
    Mystring ob = new Mystring(g);
    System.out.println("Enter The String: ");
    String s = sc.nextLine();
    @SuppressWarnings("unused")
    Mystring obj = new Mystring(s);
    ob.rev();
    ob.palli();
    

}

}