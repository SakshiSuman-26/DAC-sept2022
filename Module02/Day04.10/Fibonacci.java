import java.lang.*;
import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		
		int temp =0;
		int pre = 0;
		int next = 1;
		
		System.out.print(" "+next);
		
		for(int i=2; i<=n; i++)
		{
			temp = pre + next;
			pre = next;
			next = temp;
			System.out.print(" "+temp);
		}
	}
}