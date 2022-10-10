class Student
{
	static int rollNum;
	static String name;
	static double marks;
	
	Student()    //default construtor
	{
		rollNum = 01;
		name = "SAKSHI";
		marks = 377.5;
	}
	Student(String s2, double s3, int s1)  // parameterized constructor
	{
		rollNum = s1;
		name = s2;
		marks = s3;
	}
	Student(int s1, double s3, String s2)
	{
		rollNum = s1;
		name = s2;
		marks = s3;
	}
	Student(String s2, int s1, double s3)
	{
		rollNum = s1;
		name = s2;
		marks = s3;
	}
	void display()
	{
		System.out.println("your Roll number is: "+rollNum);
		System.out.println("your Name is: "+name);
		System.out.println("your marks is: "+marks);
	}
	
	
	public static void main(String args[])
	{
		System.out.printf("First student's details: \n");
		Student std1 = new Student();
		std1.display();
		System.out.println("========================");
		
		System.out.printf("Second student's details: \n");
		Student std2 = new Student("RENUKA", 355.68, 02);
		std2.display();
		System.out.println("========================");
		
		System.out.printf("Third student's details: \n");
		Student std3 = new Student(03,450.89,"RITESH");
		std3.display();
		System.out.println("========================");
		
		System.out.printf("Fourth student's details: \n");
		Student std4 = new Student("SANDIP",04,550.0);
		std4.display();
		System.out.println("========================");
		
	}
}