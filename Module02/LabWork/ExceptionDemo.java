class ExceptionDemo
{
	public static void main(String args[])
	{
		int a= 10;
		int b= 0;
		int res = 0;
		int res1=0;
		int arr[] = {5,10,15,20,25};
		System.out.println("Calculating the result");
		try
		{
			res = a/b;
			res1 = arr[6];
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught here");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught here"+e.getMessage());
			//System.out.println();
		}
		
		System.out.println("result= "+res);  //0
		System.out.println("result of array= "+res1);  //0
		System.out.println("Program executed successfully");
	}
}

//   10/0  gives runtime error of ArithmeticException
/* OUTPUT

Calculating the result
ArithmeticException caught here
/ by zero
result= 0
result of array= 0
Program executed successfully
*/