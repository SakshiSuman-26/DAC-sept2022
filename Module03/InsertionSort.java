class InsertionSort
{
	static void isort(int a1[])
	{
		int n = a1.length;
		for(int i=1; i<n; ++i)  // or(int i=0; i<n-1; i++)
		{
			int key = a1[i];  //first element of sorted arr
			int j = i-1;        // int j = i if i=1 taken
			
			while(j>=0 && a1[j] > key)
			{
				a1[j+1] = a1[j]; 	//shifting by overriding
				j= j-1;
			}
			a1[j+1] = key;		// if condition gets false 
				//stop shifting & put the key element
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
		isort(a1);
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
4 7 0 5 3 4 8
0 4 7 5 3 4 8
0 4 5 7 3 4 8
0 3 4 5 7 4 8
0 3 4 4 5 7 8
0 3 4 4 5 7 8
0 3 4 4 5 7 8
*/