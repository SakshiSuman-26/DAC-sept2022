import java.util.Scanner;
class pt14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		
		}
	}
}

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1

*/