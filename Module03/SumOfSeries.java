import java.util.*;
class SumOfSeries   //using recursion
{
	static int i=1;
	static void display(int n)
	{
		if(i>n)
			System.out.println(" break");
		else
		{
			while(i<=n)
			{
				if(i%2==0)
				{
					System.out.print("1/"+i+" + ");
					i++;
				}
				if(i%2!=0)
				{
					System.out.print("1/"+i+" - ");
					i++;
				}
			}
			display(n);
			
				/*
				System.out.print("1/"+i+" - ");
				i++;
				System.out.print("1/"+(i)+" + ");
				i++;
				display(n);  */
			
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the range of you want series: ");
		int n = sc.nextInt();
		display(n);
	}
}

/*
(1- 1/2 + 1/3 - 1/4 + 1/5 -....1/N)

*/
