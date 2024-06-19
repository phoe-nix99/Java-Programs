/*
      head: NULL<-10<=>20<=>30->NULL
      
      Node       <-data->
 */
class DNode
{
	int data;
	DNode prev;
	DNode next;
	
	public DNode(int d)
	{
		data=d;
		prev=null;
		next=null;
	}
}
class DList
{
	private DNode head;
	
	public DList()
	{
		head=null;
	}
	public void insert(int d)
	{
		DNode newNode=new DNode(d);
		if(head==null)
			head=newNode;
		else
		{
			DNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
	}
	public void display()
	{
		if(head==null)
			System.out.println("List is Empty!");
		else
		{
			DNode temp=head;
			System.out.print("NULL<=>");
			while(temp!=null)
			{
				System.out.print(temp.data+"<=>");
				temp=temp.next;
			}
			System.out.println("NULL");
		}
	}
}
public class DoublyLink {

	public static void main(String[] args) {
		DList obj=new DList();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.display();
		

	}

}