class Recursion4
{

	static int fib(int n)
	{
		if(n<=1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void main(String args[])
	{
		System.out.println(fib(10));
	}
}

/*
OUTPUT:fibbonacci: 89


						  fib6 
				=fib 5 		+ 		fib 4
			=fib4 	+ 	fib3   	fib3 	+	fib2
	     fib3 + fib2   fib2+fib1  fib2+fib1	   fib1+fib0
 



*/