class opp2
{
	static int sum(int a, int b) //method
	{
		return a+b;
	}

	public static void main(String args[])
	{
		opp1 o1 = new opp1();
		int c = o1.sum(2,3); //method call
		System.out.println(c);
		System.out.println(o1.sum(2,3));
	}
}

/*output 
 5
 5 
 */