class First
{
	int a;
	First ()
	{
		System.out.println("0 arg cons of First");
	}
	First(int a)
	{
		System.out.println("1 arg cons of First");
		this.a=a;
	}
}
class Second extends First
{
	int b;
	Second()
	{
		System.out.println("0 arg cons of Second");
	}
	Second(int a)
	{
		super(a);
		System.out.println("1 arg cons of Second");
	}
	Second(int a, int b)
	{
		System.out.println("2 arg cons of Second");
		
	}
}
public class SuperDemoConsCall
{
	public static void main(String args[])
	{
		Second s1 = new Second();
		Second s2 = new Second(5,10);
		Second s3 = new Second(5);
	}
}
		/*Second s3 = new Second(5);  it will throw Error 
	                              "if" there is no 1 arg constructor
									in child class*/

/*

OUTPUT:
0 arg cons of First
0 arg cons of Second         for s1

0 arg cons of First         for s2
2 arg cons of Second   

1 arg cons of First
1 arg cons of Second     for s3
 */