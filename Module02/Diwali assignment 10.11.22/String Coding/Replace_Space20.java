import java.util.Scanner;
class Replace_Space20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		
		//char arr[] = str.toCharArray();
		String str1 = "";
		for(int  i =0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			str1 = str1+str.charAt(i);
			
			if(str.charAt(i) == ' ')
				str1 = str1+"%20";
		}
		System.out.print(str1);
		
	}
	
}
/*
OUTPUT

Enter String: Hi Hello
Hi%20Hello
*/