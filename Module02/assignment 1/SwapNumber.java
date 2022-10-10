import java.util.*;
import java.lang.*;
class SwapNumber
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st value A: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd value B: ");
		int b = sc.nextInt();
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("The swapped values are as follows:");
		System.out.println("A = "+a);
		System.out.print("B = "+b);
		
		
	}
}