import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int f=0;
		
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			System.out.print(i+" ");
		}
		System.out.print(" are Factors of "+n);
	}
}