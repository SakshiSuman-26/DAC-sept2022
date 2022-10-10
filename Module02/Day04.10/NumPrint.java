import java.lang.*;
import java.util.*;
class NumPrint
{
	public static void main(String args[])
	{
		System.out.println("For Loop");
		for(int i=20 ; i>=1 ;i--)
		{
			System.out.print(" "+i);
		}
		System.out.printf("\n==========================");
		
		System.out.printf("\nWhile loop\n");
		int i=20;
		while(i>=1)
		{
			System.out.printf(" "+i);
			i--;
		}
		
		System.out.printf("\nDo-While loop\n");
		
		do
		{
			System.out.printf(" "+i);
			i--;
		}while(i>=1);
	}
}