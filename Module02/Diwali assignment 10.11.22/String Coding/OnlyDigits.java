import java.util.*;
class OnlyDigits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		
		int len = str.length();
		System.out.println("String contains only digit = "+onlyDigit(str, len));
		
	}

	public static boolean onlyDigit(String  str ,int len)
	{
		for(int i=0; i<len; i++)
		{
			if(str.charAt(i)>'0' && str.charAt(i)>'9')  //checking by ASCII values not int values
			{
				return false;
			}
		}
		return true;
	}
	
	
}
/*
Enter String: 1234
String contains only digit = true

Enter String: abc123
String contains only digit = false

Enter String: 1234abcd
String contains only digit = false
*/




















