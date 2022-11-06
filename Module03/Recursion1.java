class Recursion1
{
	static int i=0;
	static void show()
	{
		++i;
		if(i<=5)  // termination or base condition
		{
			System.out.println("Hello World");
			show();// recursive call
		}
	}
	
	public static void main(String args[])
	{
		show();
	}
}

