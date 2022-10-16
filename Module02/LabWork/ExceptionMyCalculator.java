import java.util.Scanner;
class MyCalculator 
{
    public long power(int n, int p) throws Exception             // exception for method calling by throws
    {
        if(n==0 && p==0)
        {
           throw new Exception("n and p should not be zero.");   // exception explicitly called by throw
        }
        else if(n<0 || p<0)
        {
            throw new Exception("n or p should not be negative.");
        }
        else
        {
            return (long)(Math.pow(n,p));
        }
    }
}

public class ExceptionMyCalculator
{
    public static final MyCalculator myCal = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
	
    public static void main(String[] args) 
	{
		System.out.println("***This is an unending loop of input and corresponding output***");
		System.out.println("press *ctrl+c* to terminate after calculation");
		
		
        while (in.hasNextInt())            // unending loop of input and answer
		{
            int n = in .nextInt();
            int p = in .nextInt();
            
            try 
			{
                System.out.println("Result: "+myCal.power(n, p));
            }
			catch (Exception e) 
			{
                System.out.println("Result: "+e);
            }
        }
    }
}