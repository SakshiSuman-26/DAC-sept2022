import java.lang.*;
import java.util.*;
class LabeledBreak 
{
	public static void main(String args[])
	{
		outer: for (int i=1;i<=5;i++)
		{
			inner: for(int j=1;j<=5;j++)
			{
				System.out.println(i+","+j);
				if(i==j)
				{
					break outer;
				}
			}System.out.println("out of inner for loop");
		}System.out.println("out of outer for loop");
	}
}