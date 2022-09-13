import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give us any number to check palindrome: ");
		int n = sc.nextInt();
		System.out.println();
		int d=0;
		int x=n;
		int r=0;
	
		
	    while(n>0)
		{
			d=n%10;
			n=n/10;
			r=r*10+d;
			
		}
		
		if(x==r)
			System.out.print("palindrome number ");
		else
			System.out.print("non palindrome number ");

	}
}