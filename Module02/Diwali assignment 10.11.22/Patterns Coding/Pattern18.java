import java.util.Scanner;
class Pattern18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); //n=7
		
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


/*OUTPUT
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1

*/