class LinkedListDeletion
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
	
	static void insert(int new_data)
	{
		Node temp = new Node(new_data);
		temp.next = head;
		head = temp;
	}
	
	static void deleteNode(int key)
	{
		Node temp = head;  // node ref temp created
		Node prev = null;  // node ref prev created
		if(temp != null && temp.data == key) // loop will end where it will found the key
		{
			head = temp.next;  // if key is at 1st position we need to move head
			return;
		}
		// if key is at another position rather than 1st
		while(temp != null && temp.data != key)
		{
			prev = temp;   // assigning prev node to temp node before shifting temp
			temp = temp.next;  // shifting temp node to temp.next node
		}		
		if(temp == null)
			return;       //key not founded
		prev.next = temp.next;	// deletion
	}
	
	static void display()
	{
		Node n = head;
		while(n!= null)
		{
			System.out.print(n.data+"--->");
			n=n.next;
		}
	}
	
	public static void main(String args[])
	{
		insert(9);
		insert(11);
		insert(15);
		insert(22);
		
		System.out.println("Elements Inserted");
		display();
		
		deleteNode(15);
		System.out.println();
		System.out.println("Element 15 deleted");
		display();
		
	}
	
}
/*

Elements Inserted
22--->15--->11--->9--->
Element 15 deleted
22--->11--->9--->

*/