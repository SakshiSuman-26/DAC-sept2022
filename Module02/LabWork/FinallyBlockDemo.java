class FinallyBlockDemo
{
	public static void main(String args[])
	{
		int a= 10;
		int b= 2;
		int res= 0;
		int res1=0;
		int arr[] = {5,10,15,20,25};
		System.out.println("Calculating the result");
		
		try
		{
			res = a/b;     //no exception
			res1 = arr[4];  //no exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught here");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught here"+e.getMessage());
			
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("result = " + res);
		System.out.println("result of array= "+res1);
		System.out.println("Program executed successfully");
		
		
	}
}

/* OUTPUT
Calculating the result
finally block
result = 5
result of array= 25
Program executed successfully  */