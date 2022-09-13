import java.util.Scanner;
class p14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)//row
			{
				for(int j=n-1;j>=i;j--)//space
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)//col
				{
					System.out.print("* ");
				}
			System.out.println();
			
		}
	}
}

/*
* * * * *
 * * * *
  * * *
   * *
	*
   * *
  * * *
 * * * *
* * * * *

*/
