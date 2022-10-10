import java.util.*;
import java.lang.*;
class Circle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of the circle: ");
		double r =sc.nextDouble();
		double a=0,p;
		
		a= 3.14*r*r;
		p= 2*3.14*r;
		System.out.println("perimeter of the circle is: "+p);
		System.out.println("area of the circle is: "+a);
		
	}
}