class Demo <T>
{
	void fun1(Demo<T> d)   //type of object(d):should be same as calling object(d2) type
	{
		System.out.println(d);
	}
	
	
	void fun2(Demo<?> d)  //type of object can be any valid type of demo
	{
		System.out.println(d);
	}
	
	
	void fun3(Demo<? extends Number> d) /*any valid type whose type parameter is Number
	                                   or child class of Number  */
	{
		System.out.println(d);
	}
	
	void fun4(Demo<? super Number> d)  // it will always be any parent of Number class
	{
		System.out.println(d);
	}
}


class MyGenDemo1
{
	public static void main(String args[])
	{
		Demo<Integer> d1 = new Demo<>();
		Demo<Double> d2 = new Demo<>();
		Demo<String> d3 = new Demo<>();
		Demo<Integer> d4 = new Demo<>();
		
		//d1.fun1(d2);  //error: integer != Double
		d1.fun1(d4);   //OK
		
		d1.fun2(d2);  //OK
		d1.fun2(d3);  //OK
		
		//d1.fun3(d3);  //error: string is not child of Number Class
		//d1.fun3(d2);  //OK: double is child of Number class
		
		//d1.fun4(Parent of Number : it can be Object class)
		
	}
}

/* OUTPUT

Demo@15db9742
Demo@6d06d69c

*/