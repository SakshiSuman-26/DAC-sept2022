import java.util.*;

class ArrayList_Swap
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
		System.out.println("Enter two swapping positions :");
		int pos1=sc.nextInt();
		int pos2=sc.nextInt();
		
		System.out.println();
		System.out.println("Before :");
		display(list1);
		
		System.out.println();
		System.out.println("After Swapping :");
		Collections.swap(list1, pos1-1, pos2-1);  
		display(list1);
		
	
	}
}

/*

How many colours: 3
enter colors:
yellow
blue
green

Enter two swapping positions :
1
2

Before :
The ArrayList is:
yellow
blue
green

After Swapping :
The ArrayList is:
blue
yellow
green

*/