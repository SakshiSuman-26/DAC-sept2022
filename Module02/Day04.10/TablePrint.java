import java.lang.*;
import java.util.*;
class TablePrint
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number whose table you want: ");
		int num =  sc.nextInt();
		int ans =0;
		
		for(int i=1; i<=10 ; i++)
		{
			ans = num*i;
			System.out.println(num+" x "+i+" = "+ans);
		}
		
	}
}