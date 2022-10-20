interface Myinterface
{
	void fun1();
	interface AnotherInterface
	{
		void fun2();
	}
}

class First implements Myinterface
{
	public void fun1()
	{
		System.out.println("body given to abstract method fun1() of outer interface");
	}
}

class Second implements Myinterface.AnotherInterface
{
	public void fun2()
	{
		System.out.println("body given to abstract method fun2() of inner interface"); 
	}
}


class InnerInterfaceDemo
{
	public static void main(String args[])
	{
		Myinterface mi = new First();
		mi.fun1();    //fun1 called by object of first only
		
		Myinterface.AnotherInterface ai = new Second();
		ai.fun2();    // fun2 called by object of second only
	}
}