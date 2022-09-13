import java.util.Scanner;
class pt8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		
		for(int i=n;i>=1;i--)//row
			{
				for(int j=1;j<=i;j++)//space
				{
					System.out.print(" ");
				}
				for(int j=i;j<=5;j++)//col
				{
					System.out.print(j+" ");
				}
			System.out.println();
			
		}
	}
}

/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5 */