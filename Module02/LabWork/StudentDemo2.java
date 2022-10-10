import java.lang.*;                // constuctor call as well as method call
import java.util.*;

class Student
{
	int roll;
	int age;
	double marks;
	
	void setDetails(int r, int a, double m)           //non static method 1
	{
		roll = r;
		age = a;
		marks = m;
	}
	
	void printDetails()                   //non static method 2
	{
		System.out.println(roll+"\t"+age+"\t"+marks); 
	}
}

public class StudentDemo2
{
	public static void main(String args[])
	{
		Student stud1 = new Student(); 
		stud1.setDetails(1,20,65.20);
		
		Student stud2 = new Student();  
		stud2.setDetails(2,21,70.23);
		
		stud1.printDetails();
		stud2.printDetails();
	}
}