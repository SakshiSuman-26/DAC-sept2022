import java.util.*;
class SumOfNumbers  // sum of n natural numbers  50+49+48+47+.................+1
{
	static int sum;
	static void display(int n)
	{
		if(n<1)
			System.out.println("Sum of given natural numbers: "+sum);
		else
		{
			sum = sum+n;
			display(n-1);
		}	
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the range of you want sum: ");
		int n = sc.nextInt();
		display(n);
		
	}
}
