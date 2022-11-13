class Merge_Array
{
	public static void main(String args[])
	{
		int a[] = {23,60,94,3,102};
		int b[] = {42,16,74};
		int n = a.length+b.length;
		int res[] = new int[n];
		
		System.out.println("Given arrays: ");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
		System.out.println();
		for( int i: b)
		{
			System.out.print(i+" ");
		}	
		System.out.println();
		
		// for merging
		int i=0,j=0,k=0;
		while(i< a.length && j<b.length)
		{
			res[k++] = a[i++];
			res[k++] = b[j++];
							
		}
		// print for remaining elements
		while(i<a.length)
		{
			res[k++] = a[i++];
		}
		 while(j<b.length)
		{
			res[k++] = b[j++];
		}
		System.out.println("Given arrays after merging: ");
		for(int x: res)
		{
			System.out.print(x+" ");
		}	
			
	}
}


/* OUTPUT
Given arrays:
23 60 94 3 102
42 16 74
Given arrays after merging:
23 42 60 16 94 74 3 102

*/