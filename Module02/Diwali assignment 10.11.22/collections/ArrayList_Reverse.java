import java.util.*;

class ArrayList_Reverse
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
		System.out.println("Before :");
		display(list1);
		
		System.out.println();
		System.out.println("After reversing :");
		Collections.reverse(list1);  
		display(list1);
		
	
	}
}

/*

How many colours: 3
enter colors:
blue
green
yellow

Before :
The ArrayList is:
blue
green
yellow

After reversing :
The ArrayList is:
yellow
green
blue

*/