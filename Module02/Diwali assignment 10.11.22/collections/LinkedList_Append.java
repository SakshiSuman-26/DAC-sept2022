import java.util.*;

class LinkedList_Append
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
		
		System.out.print("enter color you want to add: ");
		String newColour = sc.nextLine();
		list1.addLast(newColour);
		
		System.out.println();
		System.out.println("After Adding :");
		display(list1);
		
	
	}
}

/*

How many colours: 3
enter colours:
red
blue
green

The LinkedList is:
red
blue
green
enter color you want to add: white

After Adding :
The LinkedList is:
red
blue
green
white



*/