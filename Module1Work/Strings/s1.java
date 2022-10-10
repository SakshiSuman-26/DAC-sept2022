import java.lang.*;
import java.util.*;

class s1
{
	public static void main(String args[])
	{
		String name = new String("Sakshi");
		System.out.println(name); 
		
		String course = "PGDAC";
		System.out.println(course);
		
		System.out.println("======================");
		
		int a =5;
		float b =5.5879f;
		char c ='A';
		System.out.printf("The value of a is \t %d and \n value of b is \t %f\n",a,b);
		System.out.printf(" The char value is %c \n",c);
		
		//using \n for next line and \t for tab
		System.out.println("======================");
		
		String s= "hello";
		
		for (int i=0; i<10; i++)
		{
			System.out.println(" CDAC mumbai "+s);
		}
		
		
	}
}

/*   output:
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello
 CDAC mumbai hello*/