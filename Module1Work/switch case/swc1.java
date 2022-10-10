import java.util.Scanner;
class swc1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		int a= sc.nextInt();
		//String grade = null;
		
		switch(a/10)
		{
			case 8:
			System.out.println("Passed with Distinction"); //80-89
			break;
			
			case 7:
			System.out.println("Passed with grade A"); //70-79
			break;
			
			case 6:
			System.out.println("Passed with grade B");  //60-69
			break;
			
			case 5:
			System.out.println("Passed with grade C");  //50-59
			break;
			
			case 4:
			System.out.println("Passed with grade D"); //40-49
			break;
			
			case 3:
			System.out.println("Fail");  //30-39 that is below 40
			break;
			
			default:
			System.out.println("invalid choice");
			break;
		}
		//System.out.println("Your grade is: "+grade);
	}
}