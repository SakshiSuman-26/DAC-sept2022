import java.util.Scanner;
class Count_Duplicates    //count duplicate character
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		System.out.print("Enter character to be counted: ");
		char c = sc.nextLine().charAt(0);  
		int count = 0;
		
		
		for(int i=0; i<str.length(); i++)
		{
			if( str.charAt(i) == c )
				count++;
		}
		System.out.println("Output: "+count);
	}
}
/*

OUTPUT

Enter String: sakshiiii is happyyy
Enter character to be counted: i
Output: 5


*/







