import java.util.*;
import java.lang.*;
class GrossSalary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give us the value of your Basic salary: ");
		double b = sc.nextDouble();
		double hra=0.0;
		double da=0.0;
		double gs=0.0;
		
		if (b<10000)
		{
			hra = b/10;   //10%
			da = b*9/10;   //90%
		}
		else if (b>=10000)
		{
			hra =2000;
			da = b*98/100;
		}
		else
			System.out.print("Invalid value");
		
		gs = b+hra+da;
		System.out.print("Your Gross Salary is: "+gs+" INR");
	}
}