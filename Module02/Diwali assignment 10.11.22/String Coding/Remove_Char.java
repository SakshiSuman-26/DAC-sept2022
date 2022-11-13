import java.util.*;
class Remove_Char
{
	public static void removeChar(String word, char ch)
	{
		int len = word.length();
		
		System.out.println("OUTPUT: ");
		for(int i=0; i<len-1; i++)
		{
			if(word.charAt(i) == ch)
				continue;
			else
				System.out.print(word.charAt(i));
		}
		// if last char is to be removed then:-
		if(word.charAt(len-1) == ch)
			System.out.print("");
		else
			System.out.print(word.charAt(len-1));
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		System.out.print("Enter character to be removed: ");
		char c = sc.nextLine().charAt(0);
		
		removeChar(str , c);
	}
}
	
/*

Enter String: helloo
Enter character to be removed: o
OUTPUT:
hell

Enter String: helloo
Enter character to be removed: l
OUTPUT:
heoo

*/