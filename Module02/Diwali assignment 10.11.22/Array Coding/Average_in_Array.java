class Average_in_Array
{
	public static void main(String args[])
	{
		int a[] = {5,14,35,89,140};
		
		int n = a.length;
		
		System.out.println("Given array: ");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
		System.out.println();
		
		// for average
		System.out.println("after average: ");
		for(int i=1; i<n-1; i++)
		{
			System.out.print((a[i-1]+a[i]+a[i+1])/3+" ");
		}
	}
}


/* OUTPUT

Given array:
5 14 35 89 140
after average:
18 46 88

*/