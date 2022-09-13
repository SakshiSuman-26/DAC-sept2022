import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year: ");
		int a = sc.nextInt();
		if(a%400==0 || a%4==0)
		{
			System.out.println("year "+a+" is a leap year");
		}
		else
		{
			System.out.println("year "+a+" is a non leap year");
		}
		
		
	}
}