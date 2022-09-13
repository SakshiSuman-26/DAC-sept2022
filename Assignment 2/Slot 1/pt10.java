import java.util.Scanner;
class pt10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		char x='A';
		
		for(int i=n;i>=1;i--)//row
			{
				for(int j=1;j<=i;j++)//space
				{
					System.out.print(" ");
				}
				for(int j=i-1;j<5;j++)//col
				{
					System.out.print((char) (x+ j)+" ");
				}
			System.out.println();
			
		}
	}
}

/*

    E 
   D E 
  C D E 
 B C D E 
A B C D E */