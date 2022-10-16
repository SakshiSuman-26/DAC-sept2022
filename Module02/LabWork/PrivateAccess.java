class First
{
	private int a;
	
	First()
	{
		System.out.println("First's 0 arg const called");
	}
	First(int a)
	{
		System.out.println("First's 1 arg const called");
		this.a=a;
	}
	void setA(int a)
	{
		this.a=a;
	}
	int getA()
	{
		return a;
	}
}
class Second extends First 
{
	int b;
	Second()
	{
		System.out.println("Second's 0 arg const called");
	}
	Second(int a ,int b)
	{
		super(a);
		System.out.println("Second's 1 arg const called");
		
		this.b=b;
	}
}
class Third extends Second  
{
	int c;
	Third()
	{
		System.out.println("Third's 0 arg const called");
	}
	Third(int a, int b, int c)
	{
		//super(a); it will check immediate parent that means class B 
		setA(a);
		this.b=b;
		this.c=c;
	}
	public void fun()
	{
		System.out.println("a= "+getA());
		System.out.println("b= "+b);
		System.out.println("c= "+c);
	}
}

class PrivateAccess
{
	public static void main(String args[])
	{
		Third tobj = new Third(5,10,15);
		tobj.fun();
		
		First fobj = new First(25);
		System.out.println(fobj.getA());
		
		//fobj.a=50;  //error a is private
	}
}


/*OUTPUT

First's 0 arg const called
Second's 0 arg const called
a= 5
b= 10
c= 15
First's 1 arg const called
25

*/