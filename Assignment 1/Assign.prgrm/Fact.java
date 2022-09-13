import java.util.Scanner;
class Fact{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find its factorial: ");
		int n= sc.nextInt();
		int f=1;
		
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The factorial of the given number is: "+f);
	}
}