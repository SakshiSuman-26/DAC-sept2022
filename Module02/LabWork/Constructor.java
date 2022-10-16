import java.lang.*;
import java.util.*;

class Student
{
	int roll;
	int age;
	double marks;
	
	Student()
	{
		System.out.println("Zero-arg constructor called");
	}
	
	Student(int r)
	{
		System.out.println("One-arg constructor called");
		roll =r;
	}
	void printDetails()
	{
		System.out.println(roll+"\t"+age+"\t"+marks);
	}
}

public class Constructor
{
	public static void main(String args[])
	{
		//Student stud1 = new Student();    //1st object created
		Student stud2 = new Student(1);      //2nd object
		
		//stud1.printDetails();
		stud2.printDetails();
		
	}
}