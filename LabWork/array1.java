// find largest and smallest element of an integer array

class array1
{
	public static void main(String args[])
	{
		int arr[]=new int[]{5,8,9,6,10,4,1};
		//int n = arr.length;
		
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i<7 ;i++)
		{
			if (arr[i]>max)
			max= arr[i];
			if(arr[i]<min)
			min = arr[i];
		
		}
		System.out.println("largest num is: "+max);
		System.out.print("smallest num is: "+min);
	}
}