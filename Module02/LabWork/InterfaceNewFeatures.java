interface MyInterface
{
	void fun1();  // abstract method
	static void fun2()
	{
		System.out.println("Static method fun2() of interface");
	
	}
	public default void fun3()  //default method 
	{
		System.out.println("Default method of interface");
	}
}
class Demo implements MyInterface
{
	Demo(){}
	public void fun1()  //abstract method overriden otherwise demo will also become abstract
						//as it is implementing interface
	{
		System.out.println("Demo class fun1()");
	}
	// fun2 is static and it can't be overriden
	public void fun3()
	{
		System.out.println("Overriden default method fun3() in Demo");
	}
}



class InterfaceNewFeatures
{
	public static void main(String args[])
	{
		MyInterface.fun2();
		
		Demo d= new Demo();
		d.fun3();
		d.fun1();
	}
}

/*

OUTPUT

Static method fun2() of interface
Overriden default method fun3() in Demo
Demo class fun1()


*/