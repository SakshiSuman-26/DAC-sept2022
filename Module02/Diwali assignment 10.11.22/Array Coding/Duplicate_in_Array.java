class Duplicate_in_Array
{
	public static void main(String args[])
	{
		int a[] = {24,54,16,16,82,24,67};
		int n = a.length;
		
		System.out.print("Given array: ");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
		System.out.println();
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n-1; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);					
				}
			}						
		}	
	}
}


/* OUTPUT
Given array: 24 54 16 16 82 24 67
24
16

*/