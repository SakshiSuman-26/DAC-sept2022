import java.lang.*;
import java.util.*;

class s2      //different methods of string
{
	public static void main(String args[])
	{ 
		//first string and length
		String s = "Sakshi";
		System.out.println(s);
		int value = s.length();
		System.out.println("String length is= "+value);
		
		//2nd string and length
		String s1 = "Suman";
		System.out.println(s1);
		int value1 = s1.length();
		System.out.println("String length is= "+value1);

		
		//printing both string together
		System.out.println(s +" "+s1);

		
		//adding both string length
		System.out.println(s.length()+s1.length());
		

		//user input string
		       Scanner sc = new Scanner(System.in);
		System.out.println("Enter your course name: ");
		String s3 = sc.next();
		System.out.println("course name is : "+s3); 
		
		
		//lower case changing
		String s4 ="UPDAte";
		System.out.println("Input is: "+s4);
		System.out.println("Output is: "+s4.toLowerCase());

		
		//uppercase changing withuser input
		System.out.println("give lowercase: ");
		String s5 = sc.next();
		System.out.println("Output is: "+s5.toUpperCase());

		 
		// particular letters printing
		String s6 ="abcdefghijklmnop";
		System.out.println("Input is: "+s6);
		System.out.println("6th to end: "+s6.substring(5));
		System.out.println("4th to 8th: "+s6.substring(3,8));
		
		
	}
}