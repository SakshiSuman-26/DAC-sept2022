import java.util.Scanner;
class evenSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range of even series: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}