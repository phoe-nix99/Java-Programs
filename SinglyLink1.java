import java.util.*;

/*
   the purpose of this class is to implement singly linked list
   data structure using java without using collection class.
   
   head=>10->20->30->NULL
   
   Node - data + address of the next node
 */
class Node
{
	int data;
	Node next;
	
	public Node(int d)
	{
		data=d;
		next=null;
	}
}

class LList
{
	Node head; // always points to the start node of list
	public LList()
	{
		head=null;
	}
	void insert(int d)
	{
		Node newNode=new Node(d);
		if(head==null)
			head=newNode;
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	void del(int d)
	{
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			if(head.data==d)    // data is found at the very first node
				head=head.next; // move head to point the next node i.e.; first node is deleted
			else
			{
				Node temp=head;
				while(temp.next!=null && temp.next.data!=d)
				{
					temp=temp.next;
				}
				if(temp.next==null)
					System.out.println(d+" is not present in the List!");
				else
					temp.next=temp.next.next;
			}
		}
	}
	void display()
	{
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("NULL");
		}
	}
}

public class SinglyLink1 {

	public static void main(String[] args) {
		LList list=new LList();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Insert\n2. Display\n3. Delete\n4. Exit\nEnter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			 case 1:System.out.println("Enter data to insert");
			        int d=sc.nextInt();
			        list.insert(d);
			        System.out.println(d+" is added to the list");
			        break;
			 case 2:list.display();
			        break;
			 case 3:System.out.println("Enter data to delete");
		            d=sc.nextInt();
		            list.del(d);
			        break;
			 case 4:System.exit(0);
			 default:System.out.println("Wrong input!");
				 
			}
		}

	}

}