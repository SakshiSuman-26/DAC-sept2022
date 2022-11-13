import java.util.Scanner;
class Pattern24
{                 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); 
		for(int i=1; i<=n; i++)
		{
			int num = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(num+" ");
				num =num+5-j;
			}
			System.out.println();
		}
	}
}

/*

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/