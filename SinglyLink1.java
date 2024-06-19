

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
			System.out.println("1. Insert\n2. Display\n3. Exit\nEnter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			 case 1:System.out.println("Enter data");
			        int d=sc.nextInt();
			        list.insert(d);
			        System.out.println(d+" is added to the list");
			        break;
			 case 2:list.display();
			        break;
			 case 3:System.exit(0);
			 default:System.out.println("Wrong input!");
				 
			}
		}

	}

}