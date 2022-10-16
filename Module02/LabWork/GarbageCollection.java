class First       //local ref variable garbage collection
{
	String name;
	First(){}
	First(String name)
	{
		this.name = name;
	}
	public void finalize()
	{
		System.out.println("finalize called for: "+name+"\n");
	}
}
class Demo
{
	static void myFun()
	{
		First f1 = new First("First obj"); 
	}
	//f1 is local ref variable (created and destroyed within this block only)
	//ref of first object is stored nowhere after out of this scope. eligible for garbage collection
}
class GarbageCollection
{
	public static void main(String args[])
	{
		Demo.myFun();
		//Runtime.getRuntime().gc(); //explicitly initializing garbage collection 
		System.gc();
	}
}