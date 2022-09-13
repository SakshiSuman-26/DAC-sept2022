import java.util.Scanner;
class positive
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int n = sc.nextInt();
		
		if(n<0)
		{
			System.out.print(n+" is a negative number");
		}
		else
		{
			System.out.print(n+" is a positive number");
		}
	}
}
