import java.util.*;

class Q
{
	int q[];
	int r,f;
	int size;
	public Q(int s) //constructor 
	{
		size=s;
		q=new int[size]; //initialize q array with given size
		r=-1;
		f=-1;
	}
	void addq(int data)
	{
		if(r==size-1)
			System.out.println("Queue is Full /Overflow");
		else
		{
			r=r+1;
			q[r]=data;
			System.out.println(data+" is added to the queue successfully");
		}
	}
	void delq()
	{
		if(r==f)
			System.out.println("ques if empty / Underflow");
		else
		{
			f=f+1;
			System.out.println(q[f]+" is the deleted data from the queue");
		}
	}
	void displaq()
	{
		if(r==f)
			System.out.println("ques if empty / Underflow");
		else
		{ 
			System.out.println("Elements of the queue are-");
			for(int i=f+1;i<=r;i++)
			 System.out.print(q[i]+" ");
		}
	}
}
public class Queue{

	public static void main(String[] args) {
		Q obj=new Q(5);
		while(true)
		{
			System.out.println("\n1.ADDQ\n2.DELQ\n3.DISPLAYQ\n4.EXIt\nEnter Choice");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch(ch)
			{
			 case 1:System.out.println("Enter Data");
			        int d=sc.nextInt();
			        obj.addq(d);
			        break;
			 case 2:obj.delq();
			        break;
			 case 3:obj.displaq();
			        break;
			 case 4:System.exit(0);
			 default:System.out.println("wrong input!");
			}
		}

	}

}