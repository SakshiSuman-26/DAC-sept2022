class Permutation  //using backtracking strategy and recursion
{
	
	static void display(String str,String res)
	{
		if(str.length() == 0)  // base/termination condition
		{
			System.out.println(res);
			return;
		}
		else
			for(int i=0; i<str.length(); i++)
			{
				char s1= str.charAt(i); // first char
				String s2= str.substring(0,i) + str.substring(i+1);
				display(s2, res+s1);
			}
	}
	
	public static void main(String args[])
	{
		String s= "ABC";
		display(s,"");
	}
}
/* OUTPUT
ABC
ACB
BAC
BCA
CAB
CBA
*/