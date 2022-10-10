import java.util.*;

class Array5              //sum of two Arrays from user input
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("enter values for first array: ");
		int arr1[] = new int[size];
		for(int i=0; i<arr1.length ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter values for 2nd array: ");
		int arr2[] = new int[size];
		for(int i=0; i<arr2.length ;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int sumArr[] = new int[arr1.length];
		for(int i=0; i<sumArr.length; i++)
		{
			sumArr[i] = arr1[i] + arr2[i];
		}
		System.out.println("Sum of Arrays are: ");
		for(int i=0; i<sumArr.length; i++)
		{
			System.out.print(sumArr[i]+" ");
		}
	}
}