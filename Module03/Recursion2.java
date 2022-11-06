class Recursion2
{
	
	static int show(int n)
	{
		if(n==6)
			return n;
		else
			return 2*show(n+1);
	}
	
	public static void main(String args[])
	{
		System.out.println(show(3));
	}
}

/*
OUTPUT:
48
n==6
	2*(3+1)=8
		2*(4+1)=10
			2*(5+1)=12  stop recursion bcoz 5+1=6 ,it got 6
		2*----------12 =24
	2*------------------24 = 48 (final ans)	
	
	
n==7
	2*(3+1)=8
		2*(4+1)=10
			2*(5+1)=12  
				2*(6+1)=14  stop recursion bcoz 6+1=7 ,it got 7
		    2*-----------14 =28
	    2*-------------------28 =56 
	2*---------------------------56= 112 (final ans)


for n==8    256
			
			 */