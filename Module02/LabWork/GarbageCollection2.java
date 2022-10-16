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
		First f1 = new First("obj1"); //local ref variable
	}
	
class GarbageCollection2
{
	public static void main(String args[])
	{
		Demo.myFun();
		
		First f2 = new First("obj2");
		f2=null;        //obj2 eligible for garbage collection
		Runtime.getRuntime().gc(); //explicitly initializing garbage collection
	}
}