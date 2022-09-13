import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give us any number: ");
		int n = sc.nextInt();
		
		for(int i=2; i<n ; i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		
		if(n>2)
			System.out.println(n);
	}
}