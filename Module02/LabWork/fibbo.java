import java.util.*;
class fibbo   // 0 1 1 2 3 5 8 13 21 34.....
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give us the range of terms: ");
		int x = sc.nextInt();
		int temp =0;
		int pre =0;
		int next=1;
		
		System.out.print(pre+" "+next);
		
		for(int i=2; i<=x ; i++)
		{
			temp = pre + next;
			pre = next;
			next = temp;
			System.out.print(" "+temp);
		}
		
	}
}