class LinkedListInsert
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
	
	static void insertAtStart(int new_data)
	{
		Node temp = new Node(new_data);
		temp.next = head;
		head = temp;
	}
	
	static void insertAtEnd(int new_data)
	{
		Node temp = new Node(new_data);
		if(head == null)   // if its true then list is empty
		{
			head = temp; // 1st element added to empty list
			return;
		}
		
		temp.next = null;
		Node n = head;   // new ref created to traverse as we can't move head
		while( n.next != null)
		{
			n = n.next;  // traversing to the end
		}  // loop ended where n got null
		n.next = temp;  // .next of n(ref of last node) connected to the new node "temp"
		return;
	}
	
	static void insertInBetween(Node prev, int new_data)
	{
		Node temp = new Node(new_data);
		//sequence must be followed
		temp.next = prev.next; //1
		prev.next = temp;  //2
	}
	
	static void display()
	{
		Node n= head;
		while(n!=null)
		{
			System.out.print(n.data+"--->");
			n= n.next;
		}
	}
	public static void main(String args[])
	{
		
		insertAtStart(1);
		insertAtStart(3);
		insertAtStart(5);
		insertAtStart(6);
		insertAtStart(8);
		insertAtStart(9);
		System.out.println("Elements Inserted");
		display();
		
		insertAtEnd(22);
		insertAtEnd(40);
		insertAtEnd(12);
		System.out.println();
		System.out.println("Elements Inserted at end");
		display();
		
		insertInBetween(head.next, 59);
		insertInBetween(head.next.next, 69);
		System.out.println();
		System.out.println("Elements Inserted in between");
		display();
		
	}
}

/*

Elements Inserted
9--->8--->6--->5--->3--->1--->
Elements Inserted at end
9--->8--->6--->5--->3--->1--->22--->40--->12--->
Elements Inserted in between
9--->8--->59--->69--->6--->5--->3--->1--->22--->40--->12--->

*/