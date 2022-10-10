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
	void setToRuns(int totRuns)
	{
		this.totRuns = totRuns;
	}
	
	void printTotRuns()
	{
		System.out.println(totRuns);
	}
}
class Bowler extends Cricketer
{
	int totWickets;
	void setToWickets(int totWickets)
	{
		this.totWickets = totWickets;
	}
	void printTotWickets()
	{
		System.out.println(totWickets);
	}
}
class CricketerDemo
{
	public static void main(String args[])
	{
		Cricketer c1 = new Cricketer();
		c1.setDetails("Sachin","India",100);
		c1.printDetails();
		
		System.out.println("===========================");
		
		Batsman bats1 = new Batsman();
		bats1.setDetails("Rishabh","India",100);
		bats1.setToRuns(3000);
		bats1.printDetails();
		bats1.printTotRuns();
		
		System.out.println("===========================");
		
		Bowler bowl1 = new Bowler();
		bowl1.setDetails("Bumrah","India",150);
		bowl1.setToWickets(550);
		bowl1.printDetails();
		bowl1.printTotWickets();
	}
}