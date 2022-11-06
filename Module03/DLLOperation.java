class DLLOperation
{
	static Node head;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data = d;
			prev = null;
			next = null;
		}
	}
	static void insertAtStart(int new_data)
	{
		Node temp = new Node(new_data);
		temp.prev = null;
		if(head!=null)  //i.e. list is not empty
		{
			temp.next = head;
			head.prev = temp;
		}
		head = temp;  //head shifted to temp as it is 1st element now
	}
	static void insertInBetween(int key,int new_data)
	{
		Node temp = head;
		Node new_node = new Node(new_data);
		if(head == null)
			return;
		while(temp!=null && temp.data!=key)
		{
			temp = temp.next;
		}
		if(temp==null)
		{
			System.out.println("Key not found");
			return;
		}
		new_node.next = temp.next;
		temp.next = new_node;
		new_node.prev = temp;
		new_node.next.prev = new_node;  // or ==> temp.next.next.prev = new_node;
	}
	
	static void deletionAtStart()
	{
		Node temp = head;
		if(head == null)
			return;
		else
		{
			head = temp.next;
			head.prev = null;
		}
	}
	
	static void deletionAtPose(int index)
	{
		Node temp = head;
		if(head == null)  // checking if list is empty or not
			return;
		for(int i=1; i<=index-2; i++) // or (int i=0; i<index-2; i++)
		{
			temp = temp.next;
		}
		if(temp.next.next == null)  // last element deletion
		{
			temp.next.prev = null;
			temp.next=null;
			return;
		}
		temp.next = temp.next.next;
		temp.next.prev = temp;
	}
	
	static void display()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+"  ");
			n=n.next;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Elements added in beginning");
		insertAtStart(11);
		insertAtStart(9);
		insertAtStart(32);
		insertAtStart(6);		
		display();
		System.out.println();
		
		System.out.println("Elements added after given key");	
		insertInBetween(9,56);
		insertInBetween(6,43);		
		display();
		System.out.println();
				
		insertInBetween(7,33); // when key is not there
		
		System.out.println("Element deleted from beginning");	
		deletionAtStart();
		display();
		System.out.println();
		
		deletionAtStart();  //2nd time delete
		display();
		System.out.println();
		
		System.out.println("Element deleted at given position");
		deletionAtPose(1);
		display();
		
	}
}
/*

Elements added in beginning
6  32  9  11
Elements added after given key
6  43  32  9  56  11
Key not found
Element deleted from beginning
43  32  9  56  11
32  9  56  11
Element deleted at given position // given 3rd position
32  9  11

*/