import java.util.*;
public class ByteArraytoString 
{  
	public static void main(String args[])   
	{    
		System.out.print("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		byte[] bytes=str.getBytes();  
		System.out.println("Given String in Bytes = "+bytes);  
		String s=new String(bytes);     
		System.out.println("Given String in BytestoString = "+s);    	
	}  
}  