class First
{
	void myFun(int x, int y)			//Overridden method
	{
		System.out.println("myFun of First");
	}
	
	void anotherFun(int x)
	{
		System.out.println("anotherFun of First");
	}
	void myFun(double x, int y)
	{
		System.out.println("overloaded method myFun");
	}
}

class Second extends First
{
	void myFun(int x, int y)		//Just comment this method and check out the output.
	{
		System.out.println("myFun of Second");
	}
	void myFun(double x, int y,double z)
	{
		System.out.println("overloaded in child class method myFun");
	}
}

public class OverridingDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(2,5);		//myFun of Second
		s.anotherFun(5);	//anotherFun of First
		s.myFun(2.0,5,3);
		s.myFun(2.5,8);
	}
}

/*OUTPUT:
myFun of Second
anotherFun of First*/