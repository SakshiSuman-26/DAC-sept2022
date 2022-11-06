class ReverseLinkedList
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	static void insert(int new_data)  // insert at end
	{
		Node new_node = new Node(new_data);
		//new_node.next=null;  no need, already known
		Node temp=head;
		if(head== null)
		{
			head=new_node;   // 1st element inserted
			return;
		}
		while(temp.next!=null)
		{
			temp = temp.next;   // traversing
		}
		temp.next = new_node;	// new node added to the position found
	}
	static void reverse()
	{
		Node last = null;
		Node curr = head;
		Node temp = null;
		
		while(curr!=null)
		{
			temp = curr.next;
			curr.next = last; // as last is null at first
			last = curr;
			curr = temp;
		}
		head = last;
	}	
	static void display()
	{
		Node temp=head;
		if(head==null)
			System.out.println("List is empty");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}	
	}	
	public static void main(String args[])
	{
		insert(10);
		insert(40);
		insert(60);
		insert(90);
		insert(20);
		insert(11);
		System.out.println("Forward List: ");
		display();
		System.out.println();
		
		System.out.println("Backward List: ");
		reverse();
		display();		
	}
}
/*

Forward List:
10 40 60 90 20 11
Backward List:
11 20 90 60 40 10

*/