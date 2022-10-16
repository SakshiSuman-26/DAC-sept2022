class Demo
{
	int a;
	int b;
	Demo(){}
	public Demo(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public String toString()
	{
		return"[a= "+a+", b= "+b+"]";
	}
	public fun()
	{
		System.out.println("fun method of Demo");
	}
}

class ForEachLoop
{
	public static void main(String args[])
	{
		System.out.println("For loop");
		int arr[] = {5,10,15,20,25};
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("For each Loop");  //specially for array print
		for(int x: arr)
		{
			System.out.println(x);
		}
		
		Demo d[] = new Demo[3];
		d[0] = new Demo(5,10);
		d[1] = new Demo(12,15);
		d[2] = new Demo(17,20);
		
		for (Demo x: d)
		{
			System.out.println(x);
		}
	}
}
