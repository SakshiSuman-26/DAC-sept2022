import java.util.Scanner;
class EqualArrays
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int j=0;
		boolean flag = false;
		
		System.out.print("Enter size of 1st array: ");
		int n = sc.nextInt();
		int a1[] = new int[n];
		System.out.println("Enter elements");
		for(i=0; i<n; i++)
		{
			a1[i] = sc.nextInt();
		}
		
		System.out.print("Enter size of 2nd array: ");		
		int m =sc.nextInt();
		int a2[] = new int[m];
		System.out.println("Enter elements");
		for(j=0; j<m; j++)
		{
			a2[j] = sc.nextInt();
		}
		
		if( a1.length == a2.length )
		{
			for(i=0; i<n; i++)
			{
				if(a1[i] == a2[i])
				{
					flag = true;					
				}
				else
				{
					flag = false;
					break;
				}
			}
			if(flag == true)				
				System.out.println("ARRAYS ARE EQUAL");
			else
				System.out.println("ARRAYS ARE NOT EQUAL");
		}
		else
			System.out.println("ARRAY LENGTHs ARE NOT EQUAL");		
		
	}
}
/*

Enter size of 1st array: 3
Enter elements
1
2
3
Enter size of 2nd array: 3
Enter elements
1
2
3
ARRAYS ARE EQUAL

*/

