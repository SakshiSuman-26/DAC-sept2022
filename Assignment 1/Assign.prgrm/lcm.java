import java.util.Scanner;
class lcm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		int m,l=1; //maximum and output
		
		
		if(a>b)
			m=a; //assigning value of a into maximum
		else
			m=b;
		//System.out.print(m+" is the largest one");
		
		for(int i=1;i<=m;i++)
		{
			
			if((m*i)%a==0 && (m*i)%b==0)
			{
				l=m*i;
				System.out.println("LCM of given numbers: "+l);
				break;
			}
				//l=(m*i);assigning calculated value into output
		}
		
		
	}
}