import java.util.*;
class RemoveSymbols
{
	static void display(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 ||
			s.charAt(i)>=48 && s.charAt(i)<=57 || s.charAt(i)==32)
			{
				System.out.print(s.charAt(i));
			}
		}		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s= sc.nextLine();
		
		display(s);	
	}
}
/*

Enter the String: Sakshi9287++++++%&*^%^#$ is a*^&$% Student*^$@!@#%&
Sakshi9287 is a Student

*/