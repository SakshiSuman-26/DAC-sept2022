import java.util.*;

class LinkedList_CheckElement
{
	static void display(LinkedList<String> list1)
	{
		System.out.println("The LinkedList with their position: ");
		
		for(int i=0; i<list1.size(); i++)
		{
			System.out.println("Element "+(i+1)+": "+list1.get(i));
		}
			
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
		
		System.out.println();
		System.out.println("Enter an element to be searched: ");
		String key = sc.nextLine();
		
		if(!list1.contains(key))
			System.out.println(key+" not founded.");
		else
			System.out.println(key+" founded.");
		
		
	}
}

/*

How many colours: 3
enter colours:
red
green
blue

The LinkedList with their position:
Element 1: red
Element 2: green
Element 3: blue

Enter an element to be searched:
red
red founded.

*/