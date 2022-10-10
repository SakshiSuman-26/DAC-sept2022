class Cricketer
{
	String name;
	String country;
	int totMatches;
	void setDetails(String name, String country, int totMatches)
	{
		this.name = name;
		this.country = country;
		this.totMatches = totMatches;
	}
	void printDetails()
	{
		System.out.println(name);
		System.out.println(country);
		System.out.println(totMatches);
	}
}
class Batsman extends Cricketer
{
	int totRuns;
	void  setDetails(String name, String country, int totMatches, int totRuns)
	{
		super.setDetails(name,country,totMatches);
		this.totRuns = totRuns;
	}
	
	void printDetails()   //method overloading
	{
		super.printDetails();  //super keyword will check direct parent class
		System.out.println(totRuns);
	}
}
class Bowler extends Cricketer
{
	int totWickets;
	void setDetails(String name, String country, int totMatches, int totWickets)
	{
		super.setDetails(name,country,totMatches);
		this.totWickets = totWickets;
	}
	void printDetails()  
	{
		super.printDetails(); 
		System.out.println(totWickets);
	}
}
class SuperDemo
{
	public static void main(String args[])
	{
		Cricketer c1 = new Cricketer();
		c1.setDetails("Sachin","India",100);
		c1.printDetails();
		
		System.out.println("===========================");
		
		Batsman bats1 = new Batsman();
		bats1.setDetails("Rishabh","India",100,3000);
		bats1.printDetails();
		
		System.out.println("===========================");
		
		Bowler bowl1 = new Bowler();
		bowl1.setDetails("Bumrah","India",150,350);
		
		bowl1.printDetails();

	}
}