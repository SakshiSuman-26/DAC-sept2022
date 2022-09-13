import java.util.Scanner;
class pt2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		char x= 'A';
		
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char) (x+ j)+" ");
				
			}
			
			System.out.println();
		
		}
	}
}

/*
A 
A B 
A B C 
A B C D 
A B C D E */