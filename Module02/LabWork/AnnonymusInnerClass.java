interface MyInterface
{
	void fun1();
	void fun2();
}

class First implements MyInterface     //no use of this class in this case
{
	public void fun1()
	{
		System.out.println(" fun1 method implemented by class First");
	}
	public void fun2()
	{
		System.out.println(" fun2 method implemented by class First");
	}
	
}

class MyClass          //annonymus class
{
	void myFun()
	{
		System.out.println("myFun method of MyClass");
	}
}



class AnnonymusInnerClass
{
	public static void main(String args[])
	{
		MyInterface mif1 = new MyInterface(){
			public void fun1()
			{
				System.out.println(" fun1 method of annonymus inner class");
			}
			public void fun2()
			{
				System.out.println(" fun2 method of annonymus inner class");
			}
			
		};
		mif1.fun1();
		mif1.fun2();
		
		MyClass cls = new MyClass(){
			void myFun()
			{
				System.out.println("myFun is overrided here");
			}
			
		};
		cls.myFun();
		
	}
}

/* OUTPUT

 fun1 method of annonymus inner class
 fun2 method of annonymus inner class
myFun is overrided here
 
 */