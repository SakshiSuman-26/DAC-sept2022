import java.util.*;

class ArrayList_Retrieve
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
		System.out.print("Enter the position to be retrieved:  ");
		int pos = sc.nextInt();
		System.out.println(list1.get(pos-1));  //index = pos-1
		
	
	}
}

/*

How many colours: 3
enter colors:
yellow
red
blue

The ArrayList is:
yellow
red
blue

Enter the position to be retrieved:  3
blue


*/