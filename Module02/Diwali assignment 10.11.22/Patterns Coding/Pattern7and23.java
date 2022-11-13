import java.util.Scanner;
class Pattern7and23
{                 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired row number: ");
		int n = sc.nextInt(); 
		int num =1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(num%2==0) //even places have 0
					System.out.print(0);
					
				else
					System.out.print(1);  //odd places have 1
				num++;
			}
			System.out.println();
		}
		
	}
}	

/*

10101
01010
10101
01010
10101


1010101
0101010
1010101
0101010
1010101
0101010
1010101

*/

/*
      2nd METHOD
for (int i=1; i<=n; i++) 
{
	int num;
	  
	if(i%2 == 0)
	{
		num = 0;  
		for (int j=1; j<=n; j++)
		{
			System.out.print(num);                      
			num = (num == 0)? 1 : 0;
		}
	}
	else
	{
		num = 1;                  
		for (int j=1; j<=n; j++)
		{
			System.out.print(num);                      
			num = (num == 0)? 1 : 0;
		}
	}              
	System.out.println();
}

*/
