import java.util.Scanner;
class Pattern4
{                 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); 
		
		for(int i=0; i<n; i++)
		{
			for(int j=n; j>i; j--)
			{
				System.out.print(" "); 
			}
			int c=1; //first line is always 1
			for(int j=0; j<n; j++)
			{
				System.out.print(c+" ");
				c = c*(i-j)/(j+1);
			}
			System.out.println();
		}
		
	}
}
/*
 1 
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 after adding space to it
    1 
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1  */