class Demo
{
	Demo()
	{
		a=0;
		b=0;
	}
	Demo(int x, int y)
	{
		a = x;
		b = y;
	}
	void change(Demo d)
	{
		d.a++;
		d.b++;
	}
	void print()
	{
		System.out.println(a+" "+b);
	}
	
}
public class CallByRef
{
	public static void main(String args[])
	{
		int a;
	    int b;
		Demo d1 = new Demo(10,20);
		Demo d2 = new Demo();
		d1.change(d2);
		d2.print();
	}
	
}