class Demo
{
	int a;
	void fun1()
	{
		System.out.println("fun1 of Demo");
	}
}
class ObjectMethodDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		System.out.println(d1.hashCode()+" =d1");
		System.out.println(d2.hashCode()+" =d2");
		
		System.out.println("d1.toString():"+d1.toString());
		System.out.println("d2.toString():"+d2.toString());
	}
}


/*OUTPUT
366712642    =d1
1829164700   =d2

d1.toString():Demo@15db9742
d2.toString():Demo@6d06d69c   hexa form of hashcode
*/