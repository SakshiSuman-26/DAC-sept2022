import java.util.*;
class ArrayBinarySearch
{
	static int bSearch(int a1[],int x,int left,int right)
	{// right=high  left=low
		if(right>=left)
		{
			int mid = (left+right)/2;
			if(a1[mid] ==x)
				return mid;
			if(a1[mid] > x)
				return bSearch(a1,x,left,mid-1);
			
			return bSearch(a1,x,mid+1,right);
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a1[]={1,2,3,4,5,6,7};
		System.out.print("Give us the element to be searched: ");
		int x= sc.nextInt();  //search key
		int n = a1.length;
		int res = bSearch(a1,x,0,n-1);
		if(res == -1)
			System.out.print("Not found");
		else
			System.out.print("Found !");
		
	}
}

/*

Give us the element to be searched: 4
Found !

*/