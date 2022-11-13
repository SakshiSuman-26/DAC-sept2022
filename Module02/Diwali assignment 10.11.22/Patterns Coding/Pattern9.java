import java.util.Scanner;
class Pattern9
{                 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); 
		for(int i =1; i<=n;i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)//row
		{
			for(int j=1;j<i;j++)//space
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)//col
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}	

/*
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
    5 6
   4 5 6
  3 4 5 6
 2 3 4 5 6
1 2 3 4 5 6

*/