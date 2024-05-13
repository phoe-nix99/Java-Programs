import java.util.*;


public class primefactors {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:  ");
		int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
		sc.close();
        System.out.println("The factors of "  +x+  " are: ");
		for (int i=1;i<=x;i++) {
			
			if (x%i==0) {
				
				System.out.println(i);
				
			}
			
		}
        System.out.println("The factors of "  +y+  " are: ");
        for (int z=1;z<=y;z++) {
			
			if (y%z==0) {
				
				System.out.println(z);
				
			}
			
		}

	}

}
