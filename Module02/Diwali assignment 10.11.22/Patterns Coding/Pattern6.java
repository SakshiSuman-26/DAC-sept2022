import java.util.Scanner;
class Pattern6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); //n=7
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}


/*OUTPUT
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/