import java.util.Scanner;
class Pattern15
{                 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); 
		
		for(int i =1; i<=n;i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}



/*

1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6
			 space added in front
1 2 3 4 5 6   0 
2 3 4 5 6    1
3 4 5 6     2
4 5 6      3
5 6  	  4
6   	      5



*/