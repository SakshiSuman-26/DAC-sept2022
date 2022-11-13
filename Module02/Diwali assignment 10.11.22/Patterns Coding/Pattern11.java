import java.util.Scanner;
class Pattern11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		char x='A';
		
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(x+j)+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)//row
		{
			for(int j=0;j<i;j++)//col
			{
				System.out.print((char)(x+j)+" ");
			}
			System.out.println();
		}
		
	}
}

/*
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F

  */