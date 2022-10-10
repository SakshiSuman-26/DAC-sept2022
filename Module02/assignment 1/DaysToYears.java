import java.util.*;
import java.lang.*;
class DaysToYears
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Days: ");
		int days = sc.nextInt();
		int y=0,m,d,rem1,rem2;
		
		y=days/365; rem1=days%365;
		m=rem1/12;  rem2=rem1%12;
		d=rem2%30; 
		
		System.out.println("==============================");
		System.out.println("Years: "+y);
		System.out.println("Months: "+m);
		System.out.println("Remaining days: "+d);
		
	}
}