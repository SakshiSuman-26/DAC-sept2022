
class ArrayException
{
	public static void fun1()
	{
		int arr[] = {1,2,3,4,5,6,7};
		
		try
		{
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}

class MyFunNestedTryCatch
{
	public static void main(String args[])
	{
		int a =10;
		int b =0;
		int res1=0;
		int res2 =0;
		
		try
		{
			res1 = a/b;
			System.out.println("Result1: "+res1);
			
			try
			{
				ArrayException.fun1();
				System.out.println("Result2: "+res2);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Res2: "+e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Res1: "+e);
		}
	}
}

/* OUTPUT


Res1: java.lang.ArithmeticException: / by zero
		as there is an exception in outer try block so it will not enter the inner try block
		which is in fun1 method here

*/