class Demo <T1,T2>
{
	T1 a;    //it will store ref for Integer wrapper class
	T2 b;    //it will store ref for Double wrapper class
	double d;   // it will store directly the primitive value
	
	Demo(){}
	
	Demo(T1 a, T2 b, double d)
	{
		this.a = a;
		this.b = b;
		this.d = d;
	}
	
	public String toString()
	{
		return "values of a: "+a+", b: "+b+", d: "+d;
		
	}
}

class GenDemoTwoPara
{
	public static void main(String args[])
	{
		Demo<Integer,Double> d1 = new Demo<Integer,Double>(10,25.6,15.5);
		
		System.out.println(d1);
	}
}


/* OUTPUT

values of a: 10, b: 25.6, d: 15.5


*/