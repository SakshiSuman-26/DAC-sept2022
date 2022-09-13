import java.util.Scanner;
class pt12
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
					System.out.print(i+" ");
				}
			System.out.println();
			
		}
	}
}

/*
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5  */