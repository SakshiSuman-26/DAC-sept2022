class Demo
{
	int a;
	Demo(){}
	Demo(int a);
	{
		this.a = a;
	}
	void fun1()
	{
		System.out.println("fun1 of Demo");
	}
}
class EqualsMethodDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(5);
		Demo d2 = new Demo(5);
		Demo d3;
		d3=d1;
		
		System.out.println(d1.hashCode()+" =d1");
		System.out.println(d2.hashCode()+" =d2");
		
		System.out.println("d1.toString():"+d1.toString());
		System.out.println("d2.toString():"+d2.toString());
		
		System.out.println("d1.equals(d2):"+d1.equals(d2));
		//false : address ios different here though values are same
		System.out.println("d1.equals(d3):"+d1.equals(d3));
		//true : address is same here
		
		
	}
}


/*OUTPUT
366712642    =d1
1829164700   =d2

d1.toString():Demo@15db9742
d2.toString():Demo@6d06d69c   hexa form of hashcode
*/