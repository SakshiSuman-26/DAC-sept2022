import java.util.*;

class ArrayList_AddFirst
{
	static void display(List<String> list1)
	{
		System.out.println("The ArrayList is: ");
		
		for(String x : list1)
			System.out.println(x);
	}
	
	public static void main(String args[])
	{
		List<String> list1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many colours: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String str;
		System.out.println("enter colors: ");
		for(int i=0; i<n; i++)
		{
			str = sc.nextLine();
			list1.add(str);
		}
		
		System.out.println();
		display(list1);
		
		System.out.println();
		System.out.print("Enter the colour you want to add:  ");
		String newColour = sc.nextLine();
		list1.add(0,newColour);
		
		System.out.println("After adding an element to 1st position: ");
		System.out.println();
		display(list1);
	
	}
}

/*

How many colours: 3
enter colors:
pink
blue
red

The ArrayList is:
pink
blue
red

Enter the colour you want to add:  white
After adding an element to 1st position:

The ArrayList is:
white
pink
blue
red


*/