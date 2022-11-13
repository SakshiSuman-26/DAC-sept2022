import java.util.Scanner;
class Smallest_Largest
{
	public static void main(String args[])
	{
		int a[] = {6,12,45,23,1,56,5,4};
		int n = a.length;
		int min =a[0];
		int max =a[0]; 
		for(int i=0; i<n; i++)
		{
			if(a[i]< min)
			{
				min = a[i];
			}
			if(a[i]> max)
			{
				max = a[i];
			}
		}
		System.out.println("SMALLEST: "+min);
		System.out.println("LARGEST: "+max);
	}
}