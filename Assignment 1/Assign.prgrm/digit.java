import java.util.Scanner;
class digit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give us any number to show its digits: ");
		int n = sc.nextInt();
		int r;
		for(int i= 1;i<=n; i++)
		{
			r=n%10;
			n=n/10;
			System.out.println(r);
			
		}

	}
}