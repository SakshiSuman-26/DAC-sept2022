class First
{
	int num = 5;
}
class Second extends First
{
	int num = 10;
}

class VariableBindingDemo
{
	public static void main(String args[])
	{
		First f = new Second();
		//object of child class ,and its ref is in parent class.
		//at compile time it will check the ref type i.e parent class
		System.out.println(f.num); //5
		
		Second s = new Second();  
		System.out.println(s.num);  //10
	}
}