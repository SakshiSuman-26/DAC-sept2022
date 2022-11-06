class SelectionSort
{
	static void ssort(int a1[])
	{
		int n = a1.length;
		for(int i=0; i<n-1 ; i++)
		{
			int min = i;
			for(int j=i+1; j<n; j++)
			{
				if(a1[j] < a1[min])
					min = j;				
			}
			//swapping
			int temp = a1[min];
			a1[min] = a1[i];
			a1[i] = temp;
			
			display(a1);
		System.out.println();
		}
	}
	static void display(int a1[])
	{
		int n= a1.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int a1[] = {7,4,0,5,3,4,8};
		System.out.println(" Before sorting=====>");
		display(a1);
		
		System.out.println("\n After sorting=====>");
		ssort(a1);
		display(a1);
	}	
	
}

/*

 Before sorting=====>
7 4 0 5 3 4 8
 After sorting=====>
0 3 4 4 5 7 8



 Before sorting=====>
7 4 0 5 3 4 8
 After sorting=====>
0 4 7 5 3 4 8
0 3 7 5 4 4 8
0 3 4 5 7 4 8
0 3 4 4 7 5 8
0 3 4 4 5 7 8
0 3 4 4 5 7 8
0 3 4 4 5 7 8

*/