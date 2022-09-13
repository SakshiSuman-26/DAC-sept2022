import java.util.Scanner;
class p10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++)
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
