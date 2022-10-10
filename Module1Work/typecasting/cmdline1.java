class cmdline1

{
	public static void main(String args[])
	
	{
		String s1 = args[0];
		String s2 = args[1];
		//String sum = s1 +s2;
		
		float i = Float.parseFloat(s1);
		float j = Float.parseFloat(s2);
		float s = i+j;
		
		
		System.out.println("sum: " +s);
		//System.out.println("last name: ");
	}
}


