import java.lang.*;
import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Percentage: ");
		int per =  sc.nextInt();
		
		switch(per/10)
		{
			case 8:
			System.out.println("Passed with Distinction");
			break;
			
			case 7:
			System.out.println("Passed with Grade A ");
			break;
			
			case 6:
			System.out.println("Passed with Grade B ");
			break;
			
			case 5:
			System.out.println("Passed with Grade C ");
			break;
			
			case 4:
			System.out.println("Passed with Grade D ");
			break;
			
			case 3:
			System.out.println("Failed ");
			break;
			
			default:
			System.out.println("invalid choice");
			break;
		}
		
		
		
	}
}