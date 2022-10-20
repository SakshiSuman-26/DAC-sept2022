class MethodLocalInnerClass
{
	public static void myFun()
	{
		System.out.println("myFun of methodinnerclass");
		
		class MyClass   //Method inner class
		//it's object will always br created inside the method only.
		{
			int add(int a, int b)
			{
				return a+b;
			}
		}
		MyClass obj1 = new MyClass();
		int res = obj1.add(5,10);
		System.out.println("SUM IS: "+res);
		
	}
	public static void main(String args[])
	{
		myFun();  //static method inside same class is called here.
	}
	
}

/*
OUTPUT


myFun of methodinnerclass
SUM IS: 15


*/