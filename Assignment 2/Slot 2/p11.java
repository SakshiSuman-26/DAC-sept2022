import java.util.Scanner;
class p11
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
				System.out.print("*");
			}
			
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*****
 *****
  *****
   *****
    *****
	
	*/
