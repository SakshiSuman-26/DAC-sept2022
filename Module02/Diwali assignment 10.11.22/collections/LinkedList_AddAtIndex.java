import java.util.*;

class LinkedList_AddAtIndex
{
	static void display(LinkedList<String> list1)
	{
		System.out.println("The LinkedList is: ");
		
		for(String x : list1)
			System.out.println(x);
	}
	
	public static void main(String args[])
	{
		LinkedList<String> list1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many colours: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		String str;
		System.out.println("enter colours: ");
		for(int i=0; i<n; i++)
		{
			str = sc.nextLine();
			list1.add(str);
		}
		
		System.out.println();
		display(list1);
		
		System.out.print("enter new element: ");
		String newColour = sc.nextLine();
		System.out.print("enter position: ");
		int pos = sc.nextInt();
		list1.add(pos-1,newColour);
		
		System.out.println();
		System.out.println("After Adding :");
		display(list1);
		
	
	}
}

/*

How many colours: 4
enter colours:
red
green
blue
pink

The LinkedList is:
red
green
blue
pink
enter new element: white**
enter position: 3

After Adding :
The LinkedList is:
red
green
white**
blue
pink


*/