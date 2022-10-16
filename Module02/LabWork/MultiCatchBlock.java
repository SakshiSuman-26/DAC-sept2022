class MultiCatchBlock
{
	int a = 10;
	int b = 2;
	int res =0;
	
	int arr[]={5,10,15,20,25};
	try
	{
		res = a/b;
		System.out.println()
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArithmeticException/ArrayIndexOutOfBoundsException: ");
	}
	System.out.println("Result: "+res);
	
	
	
	
	
}