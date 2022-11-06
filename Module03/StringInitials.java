import java.util.*;
class StringInitials
{
	static void display(String s)
	{
		System.out.print(Character.toUpperCase(s.charAt(0))+". ");
		for(int i=1; i<s.length(); i++)
		{
			if(s.charAt(i) ==' ')
				System.out.print(Character.toUpperCase(s.charAt(i+1))+". ");
		
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
/* OUTPUT
Enter the String: Sakshi suman
S. S.
*/