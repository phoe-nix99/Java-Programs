import java.util.*;

class Account
{
	int ac_no;
	int balance;
	public Account(int ac, int am)
	{
		ac_no=ac; //account no initialization
		balance=am; // balance initilaization
		System.out.println("Account is initialized succesfully");
	}
	void deposite(int am)
	{
		balance+=am;
		System.out.println(am+" is deposited successfully");
	}
	void withdraw(int am)
	{
		if(balance<am)
			System.out.println("Insufficient Balance!");
		else
		{
			balance-=am;
			System.out.println("Updated Balance is "+balance);
		}
	}
	void check_balance()
	{
		System.out.println("ACC NO: "+ac_no+"\nAmount: "+balance);
	}
	int get_acno()
	{
		return ac_no;
	}
}
public class Demo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
		Account obj[]=new Account[10];  // declaring an array of Account class objects
		int i=0;
		while(true)
		{
			System.out.println("0. Create Account.\n1. Deposite.\n2. Withdraw.\n3.Check Balance.\n4. Exit.\nEnter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				
			    case 0: if(i<10) {
			    	    System.out.println("Enter A/C No & Initial Balance");
		                int ac=sc.nextInt();
		                int am=sc.nextInt();
		                Account ob=new Account(ac,am); //constructor initialization
		                obj[i++]=ob;  //push object to obj[] 
			            }
			            else
			            	System.out.println("No New Account can be created!");
		                break;
				
			    case 1: System.out.println("Enter Acc No");
			            int ac=sc.nextInt();
			            int f=0;
			            for(int j=0;j<i;j++)
			            {
			            	if(obj[j].get_acno()==ac)  //ac is found
			            	{
			            		f=1;
			            		System.out.println("Enter Amount to deposite");
				                int am=sc.nextInt();
				                obj[j].deposite(am);
			            	}
			            }
			    	    if(f==0)
			    	    	System.out.println("Given A/C no doesn't exists!");
		                break;
				case 2: System.out.println("Enter Acc No");
	                    ac=sc.nextInt();
	                    f=0;
	                    for(int j=0;j<i;j++)
	                    {
	            	      if(obj[j].get_acno()==ac)  //ac is found
	            	      {
	            		    f=1;
	            		    System.out.println("Enter Amount to withdraw");
		                    int am=sc.nextInt();
		                    obj[j].withdraw(am);
	            	      }
	                    }
	    	            if(f==0)
	    	    	     System.out.println("Given A/C no doesn't exists!");
                        break;
				case 3: System.out.println("Enter Acc No");
                        ac=sc.nextInt();
                        f=0;
                        for(int j=0;j<i;j++)
                        {
        	              if(obj[j].get_acno()==ac)  //ac is found
        	               {
        		             f=1;
        		             obj[j].check_balance();
        	               }
                        }
	                    if(f==0)
	    	             System.out.println("Given A/C no doesn't exists!");
                        break;
				case 4: System.exit(0);
				default: System.out.println("Wrong choice!");
			}
		}

	}

}