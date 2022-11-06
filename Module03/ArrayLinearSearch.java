import java.util.*;
class ArrayLinearSearch
{
	static int lSearch(int a1[],int x)
	{
		int n = a1.length;
		for(int i=0; i<n; i++)
		{
			if(a1[i] == x)   //x =search key
				return i;
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a1[]={1,2,3,4,5,6,7};
		System.out.print("Give us the element to be searched: ");
		int x= sc.nextInt();  //search key
		int res = lSearch(a1,x);
		if(res == -1)
			System.out.print("Not found");
		else
			System.out.print("Found !");
		
	}
}
/*
Element found in 
Worst case(last element)=== O(n)  n attempts
Best case(first element)=== O(1)  1st attempts

if we didn't got the element still == O(n) bcoz loop executed n times.


*/
 