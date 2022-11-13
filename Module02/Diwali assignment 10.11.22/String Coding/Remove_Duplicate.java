import java.util.*;
class Remove_Duplicate
{	
	public static void remove(String str)
	{
		int len = str.length();
		
		for(int i=0; i<len-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
				continue;
			else
				System.out.print(str.charAt(i));
		}
		System.out.print(str.charAt(len-1)); // last char printed
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		
		remove(str);
		
	}		
	
}


/*  OUTPUT and test cases

Enter String: Saksshi
Sakshi

Enter String: RRitesh
Ritesh

Enter String: javaaaa
java

*/

