import java.util.*;
import java.lang.*;
class Percentage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter maximum marks of each subject: ");
		int max = sc.nextInt();
		
		System.out.print("Enter 1st subject marks: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd subject marks: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd subject marks: ");
		int c = sc.nextInt();
		System.out.print("Enter 4th subject marks: ");
		int d = sc.nextInt();
		System.out.print("Enter 5th subject marks: ");
		int e = sc.nextInt();
		
		float per;
		
		per = ((float)((a+b+c+d+e)*100)/(max*5));
		
		System.out.println("==============================");
		System.out.printf("Overall Percentage is: %.2f %c",per,'%');
		
		
	}
}