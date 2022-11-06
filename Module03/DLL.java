class DLL
{
	static Node head;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data =d;
			prev = next= null;
		}
	}
	
	static void insert(int new_data)
	{
		Node temp = new Node(new_data);
		
		temp.prev = null;  // no need 
		if(head != null)
		{
			temp.next = head;
			head.prev = temp;
		}
		head = temp;
	}
	
	static void display() 
	// reversing list using DLL
	{
		Node last = null;
		Node n = head;
		System.out.println("Forward:===> ");
		while(n!=null)
		{
			System.out.print(n.data+" ");
			last= n;
			n=n.next;
		}
		System.out.println("\nBackward:===> ");
		while(last!=null)
		{
			System.out.print(last.data+" ");
			last = last.prev;
			
		}
	}
	
	public static void main(String args[])
	{
		DLL d1 = new DLL();
		
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		display();
	}
}
/*
Forward:===>
50 40 30 20 10
Backward:===>
10 20 30 40 50
*/