import java.util.*;
class GCD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = gcd(num);
		System.out.print(res);
	}
	static String gcd(int n)
	{
		if(n==1)
			return "int";
		return "gcd(int, "+gcd(n-1)+")";
	}
}

/*

3
gcd(int, gcd(int, int))
5
gcd(int, gcd(int, gcd(int, gcd(int, int))))

*/
