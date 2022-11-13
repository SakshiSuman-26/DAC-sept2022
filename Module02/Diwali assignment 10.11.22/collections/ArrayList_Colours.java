import java.util.*;

class ArrayList_AddFirst
{
	static void display(List<String> list1)
	{
		System.out.println("The ArrayList is: ");
		Iterator<String> cl = list1.iterator();
		while(cl.hasNext())
		{
			String x = cl.next();
			System.out.println(x);
		}
	}
	
	public static void main(String args[])
	{
		List<String> list1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many colours: ");
		int n = sc.nextInt();
		String str;
		System.out.println("enter colors: ");
		for(int i=0; i<=n; i++)
		{
			str = sc.nextLine();
			list1.add(str);
		}
		
		System.out.println();
		display(list1);
	
	}
}

/*

How many colours: 3
enter colors:
pink
red
blue

The ArrayList is:

pink
red
blue

*/