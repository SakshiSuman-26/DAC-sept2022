 //Generic Method

class MyGen<T>   // similar to class MyGen<T extends Object>
{
	T data;
	void setData(T data)
	{
		this.data = data;
	}
	T getData()
	{
		return data;
	}
}
class First
{
	int a;
	int b;
	
	First(int a, int b)
	{
		this.a =a;
		this.b =b;
	}
	public String toString()
	{
		return "First=[a = "+a+ ",b= "+b+"]";
	}
}

class MyGenDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>();
		mg1.setData(5);
		int a = mg1.getData();
		System.out.println(a);
		
		MyGen<String> mg2 = new MyGen<String>();
		mg2.setData("Sakshi");
		String s = mg2.getData();
		System.out.println(s);
		
		MyGen<First> mg3 = new MyGen<First>();
		mg3.setData(new First(15,20));
		First f = mg3.getData();
		System.out.println(f);  //f.toString()
		
		//mg1 = mg2   compiler shows error: type safety in generic
		
	}
}

/* OUTPUT
5
Sakshi
First@15db9742  == output without toString method
First=[a = 15,b= 20]  == after toString method

advantages of generic
 no need of typecast of class
 type safety
*/