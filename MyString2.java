import java.util.*;

class Ystring{

    void check2(String st1, String st2){
        st1.toLowerCase();
        st2.toLowerCase();
        char[] str1 = st1.toCharArray();
        char[] str2 = st2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

            if(Arrays.equals(str1, str2)){
                System.out.println("The given strings Anagram");
            }
            else{
                System.out.println("The given strings are not Anagram");
            }
}
}



public class MyString2 {

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
