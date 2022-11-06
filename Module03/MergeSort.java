class MergeSort
{
	static void msort(int a1[], int low , int high)
	{
		if(low<high)
		{
			int mid =low+(high-low)/2;
			msort(a1,low,mid);    //divide//left side
			msort(a1,mid+1,high);  //divide//right side
			
			merge(a1,low,mid,high);	//conquer			
		}
	}
	static void merge(int a1[], int low, int mid, int high)
	{
		int n1 = mid-low+1;
		int n2 = high-mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			L[i] = a1[low+i];
		for(int j=0; j<n2; j++)
			R[j] = a1[mid+1+j];
		
		int i=0,j=0;
		int k=low;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				a1[k] = L[i];
				i++;
			}
			else
			{
				a1[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a1[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a1[k] = R[j];
			j++;
			k++;
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
		int a1[] = {13,2,8,9,5,7,12,45,33};
		int n= a1.length;
		System.out.println(" Before sorting=====>");
		display(a1);
		
		System.out.println("\n After sorting=====>");
		msort(a1,0,n-1);
		display(a1);
		
	}	
}

/*

 Before sorting=====>
13 2 8 9 5 7 12 45 33
 After sorting=====>
2 5 7 8 9 12 13 33 45

*/