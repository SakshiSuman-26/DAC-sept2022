
class Batsman
{   
	Batsman(){}  //deafault constructor

	void printAvg()
	{
		System.out.println("printAvg of Batsman");
		AvgCalculator avg1 = new AvgCalculator();
		avg1.myFun();
	}
	

	//INNER CLASS
	static class AvgCalculator
	{
		void myFun()
		{
			System.out.println("myFun of static AvgCalculator class");
		}
	}
}

class StaticInnerClassDemo
{
	public static void main(String args[])
	{
		Batsman bats1 = new Batsman(); //constructor called
		bats1.printAvg();
		
		Batsman.AvgCalculator abc = new Batsman.AvgCalculator();
		abc.myFun();
		// no need of object of outer class
		
		//non static inner class scenario: 
		//Batsman bats2 = new Batsman
		//Batsman.AvgCalculator abc = bats2.new AvgCalculator();
		
	}
}


/* OUTPUT


printAvg of Batsman
myFun of static AvgCalculator class  ==>call via printAvg from main()
myFun of static AvgCalculator class  ==>direct call by main()

*/