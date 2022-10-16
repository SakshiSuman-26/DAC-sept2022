abstract class Shape           //Parent class
{                             //Hierarchial Inheritance
	double area;
	abstract void calArea();
	Shape(){}
	void printArea()
	{
		System.out.println(area);
	}
}
class Circle extends Shape       
{
	double radius;
	Circle(){}
	Circle(double radius)
	{
		this.radius = radius;
	}
	void calArea()
	{
		area = 3.14*radius*radius;
	}
}
class Rectangle extends Shape 
{
	double len;
	double br;
	Rectangle()
	{
		
	}
	Rectangle(double len,double br)
	{
		this.len = len;
		this.br = br;
	}
	void calArea()
	{
		area = len*br;
	}
}
class Square extends Shape
{
	double side;
	Square(){}
	Square(double side)
	{
		this.side = side;
	}
	
	void calArea()
	{
		area = side*side;
	}
}
class ShapeAreaDemo
{
	public static void main(String args[])
	{
		Shape s[] = new Shape[3];
		
		s[0]= new Rectangle(4.0,5.0);
		s[1]= new Circle(6.0);
		s[2]= new Square(7.0);
		
		for(int i=0;i<3;i++)
		{
			s[i].calArea();	//Same statement is calling different methods of different class //Polymorphic behaviour.
			s[i].printArea();
		}
	}
}



/* OUTPUT

20.0
113.03999999999999
49.0


*/
