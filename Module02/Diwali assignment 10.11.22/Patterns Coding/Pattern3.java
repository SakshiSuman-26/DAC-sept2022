import java.util.Scanner;
class Pattern3
{                 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); 
		int num = 1;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(num+" ");
				num =num+1;
			}
			
			System.out.println();
		}
		
	}
}

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/