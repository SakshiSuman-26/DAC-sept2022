class cmdline4
{
	public static void main(String args[])
	{
		
		String max;
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		max = ((a>b && a>c)? (a+" is max"):(b>c)? (b+" is max"): (c+" is max"));
		
		
		System.out.println(max);
	}
}