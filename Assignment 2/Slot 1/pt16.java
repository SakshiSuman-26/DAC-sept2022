import java.util.Scanner;
class pt16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		
		}
	}
}
/*

5 
5 4
5 4 3
5 4 3 2
5 4 3 2 1

*/