class Reverse_Array
{
	public static void main(String args[])
	{
		int a[] = {24,54,31,16,82,45,67};
		int n = a.length;
		int temp[] = new int[n];
		int j=0;
		System.out.print("Before array: ");
		for( int i: a)
		{
			System.out.print(i+" ");
		}	
		
		for(int i=n-1; i>=0; i--)
		{
			temp[j] = a[i];
			j++;
		}
		System.out.println();
		System.out.print("Reverse Array: ");
		for(int i=0; i<n; i++)
		{
			a[i] = temp[i];
			System.out.print(a[i]+" ");
		}
		
	}
}
/* OUTPUT:
Before array: 24 54 31 16 82 45 67
Reverse Array: 67 45 82 16 31 54 24
*/