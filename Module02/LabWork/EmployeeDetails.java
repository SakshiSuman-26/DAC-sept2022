class Contact
{
	String email;
	String mobNo;
	Contact(String email,String mobNo)
	{
		this.email=email;
		this.mobNo=mobNo;
	}
}
class Employee
{
	String empId;
	String name;
	double salary;
	Contact contDetails;
	Employee(String empId,String name,double salary,String email,String mobNo)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		contDetails=new Contact(email,mobNo);
	}
	
	void display()
	{
		System.out.println(empId+"\t"+name+"\t"+salary+"\t\t"+contDetails.email+"\t"+contDetails.mobNo);
	}
}

class EmployeeDetails
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee("101","Sakshi", 50000.00,"sakshi@gmail.com","9845625455");
		Employee emp2 = new Employee("102","Rohini", 55000.00,"rohini@gmail.com","5651214544");
		emp1.display();
		emp2.display();
	}
}
