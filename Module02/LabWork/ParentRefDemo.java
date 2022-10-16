class First
{
	void fun1()
	{
		System.out.println("fun1 of first");
	}
	void fun2()
	{
		System.out.println("fun2 of First");
	}
}
class Second extends First
{
	void fun2()         //overriding method
	{
		System.out.println("fun2 of Second");
	}
	void fun3()
	{
		System.out.println("fun3 of Second");
	}
}
class ParentRefDemo
{
	public static void main(String args[])
	{
		First f;            //ref of parent class
		f = new Second();  //object of child class
		f.fun1();
		f.fun2();
		
		//f.fun3();        //error: can not find symbol
		                    //becoz fun3 do not exist in parent class
	}                      //  though the object is of child class
}


//((Second) f).fun3; typecasted method call