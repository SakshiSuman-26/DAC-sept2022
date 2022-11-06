class TowerOfHanoi
{

	static void toh(int n,char s, char inter, char d)
	{
		if(n==1)
		{
			System.out.println(s+" --> "+d);
		}
		else
		{
			toh(n-1,s,d,inter);
			System.out.println(s+" --> "+d);
			
			toh(n-1,inter,s,d);
			
		}
	}
	
	public static void main(String args[])
	{
		int n=3;
		toh(n,'A','B','C');
	}
}

/*

OUTPUT

A --> C
A --> B
C --> B
A --> C
B --> A
B --> C
A --> C

*/