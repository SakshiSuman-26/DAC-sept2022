import java.util.Scanner;
class PrintElements
{                 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			int num = sc.nextInt();
			a[i] = num;
		}
		
		System.out.println(" using for loop");
		for( int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.print("using for each loop\n");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
	}
}

/* OUTPUT

Enter size of an array: 4
1
2
5
8
 using for loop
1 2 5 8
using for each loop
1 2 5 8

*/