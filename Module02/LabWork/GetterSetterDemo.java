class Employee
{
	private int empId;
	private String name;
	public Employee(){}
	
	public void setEmpID(int empId)
	{
		this.empId = empId;
	}
	public int getEmpID()
	{
		return this.empId;
	}
	
	public void setEmpName(String name)
	{
		this.name = name;
	}
	public String getEmpName()
	{
		return this.name;
	}
}

class GetterSetterDemo
{
	public static void main(String args[])
	{
		//1st employee
		Employee emp1 = new Employee();
		emp1.setEmpID(1);   //setting ID
		int eID = emp1.getEmpID();
		System.out.println("Employee ID is: "+eID);
		
		emp1.setEmpName("SAKSHI");  //setting Name
		String eName = emp1.getEmpName();
		System.out.println("Employee Name is: "+eName);
		
		
		//2nd employee
		Employee emp2 = new Employee();
		emp2.setEmpID(2);  //setting 2nd ID
		System.out.println("Next Employee ID is: "+emp2.getEmpID());  //  2nd ID
		
		emp2.setEmpName("Renuka"); // setting 2nd name
		System.out.println("Next Employee name is: "+emp2.getEmpName()); //  2nd Name
		
		
	}
}

/*
OUTPUT

Employee ID is: 1
Employee Name is: SAKSHI
Next Employee ID is: 2
Next Employee name is: Renuka

*/