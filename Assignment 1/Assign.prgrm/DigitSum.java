import java.util.Scanner;
class DigitSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give us any number: ");
		int n = sc.nextInt();
		int r,sum=0;
		for(int i= 1;i<=n; i++)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
			
		}
		System.out.println("The sum of the digits is: "+sum);

	}
}