import java.lang.*;
import java.util.*;

class Student
{
	int roll;
	int age;
	double marks;
	
	void printDetails()          //non static method
	{
		System.out.println(roll+"\t"+age+"\t"+marks);
	}
}

public class StudentDemo
{
	public static void main(String args[])
	{
		Student stud1 = new Student();      //default constructor call
		stud1.roll = 1;
		stud1.age = 20;
		stud1.marks =56.25;
		
		Student stud2 = new Student();    //default constructor call
		stud2.roll = 2;
		stud2.age = 21;
		stud2.marks = 46.89;
		
		stud1.printDetails();          //method call through object(ref variable)
		stud2.printDetails();
	}
}