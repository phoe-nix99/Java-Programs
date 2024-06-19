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
}

public class SinglyLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}