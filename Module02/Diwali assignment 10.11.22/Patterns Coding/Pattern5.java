import java.util.Scanner;
class Pattern5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			
			for(int j=2; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			
			for(int j=2; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
   1
  212
 32123
4321234
 32123
  212
   1
*/