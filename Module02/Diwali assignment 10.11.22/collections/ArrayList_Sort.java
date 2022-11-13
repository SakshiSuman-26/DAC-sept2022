import java.util.*;

class ArrayList_Sort
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
		System.out.println("Before sorting :");
		display(list1);
		
		System.out.println();
		System.out.println("After sorting :");
		Collections.sort(list1);  
		display(list1);
		
	
	}
}

/*

How many colours: 3
enter colors:
red
blue
green

Before sorting :
The ArrayList is:
red
blue
green

After sorting :
The ArrayList is:
blue
green
red


*/