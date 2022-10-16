import java.io.*;
import java.util.*;

public class ExceptionUserDemo        //user input and exception handling
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int res =0;
       try
       {
            int x = sc.nextInt();
            int y = sc.nextInt();
            res = x/y;
            System.out.println(res);
       }
       catch(ArithmeticException e)
       {
           System.out.println("java.lang.ArithmeticException: "+e.getMessage());
       }
       catch(InputMismatchException e)
       {
           System.out.println("java.util.InputMismatchException");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       
    }
}

/*

Input1     	Input2			output
10 			3        	3
10 			hello		java.util.InputMismatchException
10 			0			java.lang.ArithmeticException: / by zero
23.323 		0			java.util.InputMismatchException
hello 		0			java.util.InputMismatchException
2147483648  2147483648	java.util.InputMismatchException

*/