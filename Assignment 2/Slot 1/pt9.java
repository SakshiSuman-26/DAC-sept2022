import java.util.Scanner;
class pt9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		char x='A';
		
		for(int i=1;i<=n;i++)//row
			{
				for(int j=n-1;j>=i;j--)//space
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i-1;j++)//col
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