import java.util.*;
import java.lang.*;
class Temperature
{
	public static void main(String args[])
	{
		System.out.println("Conversion of Temperature value");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fahrenheit temp: ");
		float F = sc.nextFloat();
		float C =0.0f;
		
		C=((float)5*(F-32)/9);
		
		
		//System.out.println("==============================");
		System.out.printf("Celsius value: %.2f",C);  //2digit after decimal
	
		
	}
}