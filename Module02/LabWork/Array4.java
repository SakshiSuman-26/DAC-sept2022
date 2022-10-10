import java.util.*;

class Array4               //Jagged Array print from user input
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("enter values: ");
		int arr[][]= new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[5];
		
		for(int i = 0; i<2; i++)
		{
			for(int j=0; j<arr[i].length ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<2; i++)
		{
			for(int j=0; j<arr[i].length ; j++)
			{
				System.out.print( arr[i][j]+" " );
			}
			System.out.println();
		}
		
	}
}