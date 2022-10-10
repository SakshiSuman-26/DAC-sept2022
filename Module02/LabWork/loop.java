import java.lang.*;
import java.util.*;             //use of break
class loop 
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(i+","+j);
				if(i==j)
				{
					break;          //entire loop will break, there is no labelling
				}
			}System.out.println("out of inner for loop");
		}System.out.println("out of outer for loop");
	}
}