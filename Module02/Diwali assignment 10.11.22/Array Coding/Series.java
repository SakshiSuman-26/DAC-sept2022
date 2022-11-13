class Series
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6};		
		int n = a.length;		
		System.out.println("Given array: ");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
		System.out.println();
		
		System.out.println("OUTPUT series: ");
		for(int i=0; i<n; i++)
		{
			if(i%2==0) // odd places as i=0 starting index
				System.out.print(" "+a[i]*a[i]*a[i]+" ");
			
			if(i%2!=0)
				System.out.print(" "+a[i]*a[i]+" ");
		}	
	}	
}
/*

Given array:
1 2 3 4 5 6
OUTPUT series:
 1  4  27  16  125  36
 
 */