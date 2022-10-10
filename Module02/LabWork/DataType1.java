import java.lang.*;
import java.util.*;
class  DataType1
{
	public static void main(String args[])
	{
		char ch1 = 65;                 //ASCII
		char ch2 = 'A';                //char
		char ch3 = '\101';             //octal
		char ch4 = '\u0041';           //hexadecimal
		System.out.println(ch1+","+ch2+","+ch3+","+ch4);      //All will print A
		
		
		char ch5 ='J';
		ch5++;
		System.out.println(ch5);     //will print K
		
		
		int x= 015;
		System.out.println(x);      //will  print 13 == decimal value of (octal) 015
		
		
	}
}