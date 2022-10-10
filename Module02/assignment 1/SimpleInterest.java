import java.util.*;
import java.lang.*;
class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the principle Amount(in Rs.): ");
		double p = sc.nextDouble();
		System.out.print("Enter rate of interest (in %): ");
		double r = sc.nextDouble();
		System.out.print("Enter time(years): ");
		double t = sc.nextDouble();
		
		double si =0.0;
		
		si = p*r*t/100;
		
		
		System.out.println("==============================");
		System.out.println("Simple Interest : "+si);
		
		
	}
}