import java.util.Scanner;
class pt17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(j+" ");
				j++;				
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
A B C D E  
*/