class NestedTryCatch
{
	public static void main(String args[])
	{
		System.out.println("Program execution started");
		int a = 10;
		int b = 2;
		int res1 = 0;
		int arr[] = {5,10,15,20,25};
		int res2 = 0;
		
		try
		{
			res1 = a/b;
			
			try
			{
				System.out.println(arr[5]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array exception caught in inner catch");
			}
			finally
			{
				System.out.println("inner Finally");
			}	
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught in outer catch");
		}
		finally
		{
			System.out.println("outer Finally");
		}
		
		System.out.println(" Result= "+res1);
		System.out.println(" Result= "+res2);
		System.out.println("Program executed successfully");
		
	}
}


/* OUTPUT

Program execution started
Array exception caught in inner catch
inner Finally
outer Finally
 Result= 5
 Result= 0
Program executed successfully

*/