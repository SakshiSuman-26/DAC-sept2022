import java.lang.*;
import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int fact=1;
		for (int i=1; i<=a ; i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of the given number is: "+fact);
	}
}