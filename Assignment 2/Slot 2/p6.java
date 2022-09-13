import java.util.Scanner;
class p6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=0;j<i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

*********
 *******
  *****
   ***
    *
	
	*/