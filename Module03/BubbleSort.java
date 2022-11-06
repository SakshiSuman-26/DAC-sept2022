class BubbleSort
{
	static void bsort(int a1[])
	{
		int n = a1.length;
		for(int i=0; i<n-1; i++) //for pass
		{
			for(int j=0; j<n-i-1; j++)// for internal comparison
			{
				if(a1[j]> a1[j+1])
				{
					//swapping
					int temp =a1[j];  
					a1[j] = a1[j+1];
					a1[j+1] = temp;
				}
			}
			System.out.println();
			display(a1);
		}
	}
	static void display(int a1[])
	{
		for(int i=0; i<a1.length; i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int a1[] = {7,4,1,9,2,8,3,0};
		System.out.println(" Unsorted array:====>");
		display(a1);
		bsort(a1);
		System.out.println("\n Sorted array:====>");
		display(a1);
	}
}

/*

 Unsorted array:====>
7 4 1 9 2 8 3 0
4 1 7 2 8 3 0 9
1 4 2 7 3 0 8 9
1 2 4 3 0 7 8 9
1 2 3 0 4 7 8 9
1 2 0 3 4 7 8 9
1 0 2 3 4 7 8 9
0 1 2 3 4 7 8 9
 Sorted array:====>
0 1 2 3 4 7 8 9

*/