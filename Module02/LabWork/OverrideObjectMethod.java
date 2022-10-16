class Demo 
{
	int a;
	int b;
	Demo(){}
	Demo(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	void fun1()
	{
		System.out.println("fun1 of Demo");
	}
	
	//override toString() of object class
	public String toString()  //return type of this method is String
	{
		String str ="Demo[a= "+a+", b= "+b+"]";
		return str;
	}
	
	//equals method override
	public boolean equals(Object obj) //object is parent of all class so as of Demo class
	{                                 // so this is possible
		if(this.a==((Demo)obj).a && this.b==((Demo)obj).b)
		//typecasted bcoz a and b is not in object class
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		return 31*(a+b);  //to equalize hashCodeof a &b
	}
	
}
class OverrideObjectMethod
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(5,10);
		System.out.println(d1);   //returned string came here
		
		Demo d2 = new Demo(5,10);
		System.out.println("Result of equalsMethod override : "+d1.equals(d2));
		
		System.out.println("Hashcode of d1: "+d1.hashCode());
		System.out.println("Hashcode of d2: "+d2.hashCode());
	}
}


/*OUTPUT
string override

Demo@15db9742      ** before override
Demo[a= 5, b= 10]   ** after override

 ** Result of equalsMethod override : true

**********Whenever we override equals method,
 we should also override hashCode() method.**********
 
 ** before hashCode override
 Hashcode of d1: 366712642
Hashcode of d2: 1829164700

 ** after hashCode override
Hashcode of d1: 465
Hashcode of d2: 465
 

*/