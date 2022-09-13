import java.util.Scanner;
class pt7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)//row
			{
				for(int j=n-1;j>=i;j--)//space
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)//col
				{
					System.out.print(j+" ");
				}
			System.out.println();
			
		}
	}
}

/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5 */