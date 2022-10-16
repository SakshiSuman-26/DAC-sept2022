class TwoNumbers <T extends Number>
{
	T a;
	T b;
	TwoNumbers(T a, T b)
	{
		this.a = a;
		this.b = b;
	}
	double sum()
	{
		double res = a.doubleValue() + b.doubleValue();
		return res;
	}
}
class GenericsDemo
{
	public static void main(String args[])
	{
		TwoNumbers <Integer> tn1 = new TwoNumbers<Integer>(5,10);
		double res1 = tn1.sum();
		System.out.println(res1);
		
		TwoNumbers <Double> tn2 = new TwoNumbers<Double>(5.6,10.54);
		double res2 = tn2.sum();
		System.out.println(res2);
	}
}

// we can use same class for different datatype using Generic class
/* OUTPUT  

15.0
16.14      */