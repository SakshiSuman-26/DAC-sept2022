import java.util.Scanner;
class swc2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to check: ");
		//int n = sc.nextInt();
		char c = sc.nextLine().charAt(0);
		
		switch(c)
		{
			case 'a':System.out.println(c+" is vowel");
			break;
			case 'e':System.out.println(c+" is vowel");
			break;
			case 'i':System.out.println(c+" is vowel");
			break;
			case 'o':System.out.println(c+" is vowel");
			break;
			case 'u':System.out.println(c+" is vowel");
			break;
			
			case 'A'://System.out.println(c+" is vowel");
			//break;
			case 'E'://System.out.println(c+" is vowel");
			//break;
			case 'I'://System.out.println(c+" is vowel");
			//break;
			case 'O'://System.out.println(c+" is vowel");
			//break;
			case 'U':System.out.println(c+" is vowel");
			break;
			
			default:
			System.out.println(c+" is consonent");
			
		}
	}
}
