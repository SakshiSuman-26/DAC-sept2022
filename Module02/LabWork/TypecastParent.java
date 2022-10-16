class First
{
	void fun()
	{
		System.out.println("fun of First");
	}
	
}
class Second extends First
{
	void fun()
	{
		System.out.println("fun of Second");
	}
}
class Third
{
	void fun()
	{
		System.out.println("fun of Third");
	}
}

class TypecastParent
{
	public static void main(String args[])
	{
		First f = new First();        //parent
		Second s = new Second();      //child
		Third t = new Third();
		
		f = s;       //upcasting:f will hold Second's object's reference
		
		//f.fun();    // fun of Second
		// s = f;    // error, child <= parent's ref (downcasting)
		// f = t;    // incompatible types: error, no relationship
		
		s = (Second)f;  //without f = s:will give runtime error
		s.fun();  		// fun of second
		f.fun();   		//fun of second  
						// both having the ref of second class
						
		//((Second)f).fun(); //one-liner
	}
}


/*  without f = s   will give runtime error
java.lang.ClassCastException: First cannot be cast to Second  */