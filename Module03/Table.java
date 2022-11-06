import java.util.*;
class Table
{
	static int i=1;
	static void display(int n)
	{
		if(i>10)
		{
			System.out.println("Program Terminated");
		}
		else
		{
			while(i<=10)
			{
				System.out.println(n+"*"+i+"="+(n*i));
				i++;
				display(n);
			}	
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the number of you want table: ");
		int n = sc.nextInt();
		display(n);
	}
}

/*

input N=5
	output:
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
Break
*/
