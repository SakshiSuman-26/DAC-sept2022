import java.util.Scanner;
class OrderCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		int a[] = new int[n];		
		
		System.out.println("Enter Elements: ");
		for(int i=0; i<n; i++)
		{
			int num = sc.nextInt();
			a[i] = num;
		}
		System.out.println("Given array is: ");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
		System.out.println();	
		
		System.out.println("The array's order is: ");
		int asc =0, dsc=0;
		for(int i=0; i<n-1; i++)
		{
			if( a[i]<a[i+1] )
			{
				asc++;				
			}
			else if( a[i]>a[i+1] )
			{
				dsc++;				
			}	
		}	
		if(asc == n-1)
			System.out.println(" Ascending ");
		else if(dsc == n-1)
			System.out.println(" Descending ");
		else
			System.out.println(" Random ");
		
	}	
}
/* OUTPUT


Enter size of an array: 4
Enter Elements:
1
2
3
4
Given array is:
1 2 3 4
The array's order is:
 Ascending
 
 Enter size of an array: 4
Enter Elements:
8
5
2
1
Given array is:
8 5 2 1
The array's order is:
 Descending
 
 Enter size of an array: 4
Enter Elements:
7
3
8
1
Given array is:
7 3 8 1
The array's order is:
 Random
 
 
 
 
 
 */