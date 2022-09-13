import java.util.Scanner;
class pt5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		
		
		for(int i=1;i<=n;i++)
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
A 
B B 
C C C 
D D D D 
E E E E E  */