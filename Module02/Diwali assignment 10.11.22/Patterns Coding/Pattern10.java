import java.util.Scanner;
class Pattern10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt();
		char x='A';
		
		for(int i=1;i<=n;i++)//row
		{
			for(int j=1;j<=i;j++)//col
			{
				System.out.print((char)x+" ");
			}
			x++;
			System.out.println();
		}
	}
}

/*
A
B B
C C C
D D D D
E E E E E
F F F F F F

  */