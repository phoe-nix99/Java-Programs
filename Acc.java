import java.util.*;

class Acocheck{
	int x=1000;
	Acocheck(int acc){	
		System.out.println("\nWelcome, User " +acc);
	}
	
	void balance() {
		System.out.println("\nYour Balance is: "+x);
	}
	
	void credit() {
		
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Amount to be credited: ");
		int y = sc.nextInt();
		y = x+y;
		System.out.println("\nUpdated Balance is: "+y);
		x=y;
	}
	
	void debit() {
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Amount to be debited: ");
		int b = sc.nextInt();
		b = x-b;
		System.out.println("\nUpdated Balance is: "+b);
		x=b;
		
	}
	
}

public class Acc {
	
	public static void main(String[] args) {
	@SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter account number: ");
	int k = sc.nextInt();
		
	Acocheck obj = new Acocheck(k);
	while (true) {
	System.out.println("\nSelect From The Below Options");
	System.out.println("\n1. Balance Enquiry\n2. Credit\n3. Debit\n4. Exit");
	System.out.println("\nEnter your choice: ");
	int f = sc.nextInt();
	
	switch(f) {
	
	case 1:
		obj.balance();
		break;
	case 2:
		obj.credit();
		break;
	case 3:
		obj.debit();
		break;
	case 4:
		System.exit(0);
	default:
		System.out.println("\nEnter a valid choice");
		
	
	}
	}
		
	}

}