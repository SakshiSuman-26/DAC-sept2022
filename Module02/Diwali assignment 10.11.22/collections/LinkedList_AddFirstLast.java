import java.util.*;

class LinkedList_AddFirstLast
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
		
		System.out.print("enter first element: ");
		String newColour1 = sc.nextLine();
		System.out.print("enter last element: ");
		String newColour2 = sc.nextLine();
		
		list1.addFirst(newColour1);
		list1.addLast(newColour2);
		
		System.out.println();
		System.out.println("After Adding :");
		display(list1);
		
	
	}
}

/*

How many colours: 2
enter colours:
red
green

The LinkedList is:
red
green
enter first element: white***
enter last element: yellow***

After Adding :
The LinkedList is:
white***
red
green
yellow***

*/