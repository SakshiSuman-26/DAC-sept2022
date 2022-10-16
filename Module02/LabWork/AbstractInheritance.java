abstract class Shape           //Parent class
{                             //Hierarchial Inheritance
	double area;
	abstract void calArea();
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
	{this.radius = radius;}
	
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
	{this.side = side;}
	
	void calArea()
	{
		area = side*side;
	}
}
class AbstractInheritance
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle(4.0,5.0);
		rect.calArea();
		rect.printArea();
		
		Circle c = new Circle(5.0);
		c.calArea();
		c.printArea();
		
		Square sq = new Square(6.0);
		sq.calArea();
		sq.printArea();
	}
}
