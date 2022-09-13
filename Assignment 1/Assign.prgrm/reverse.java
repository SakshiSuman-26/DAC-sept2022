import java.util.Scanner;
class reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give us any number to show its reverse: ");
		int n = sc.nextInt();
		int r;
		for(int i= 1;i<=n; i++)
		{
			r=n%10;
			n=n/10;
			System.out.print(r);
			
		}

	}
}