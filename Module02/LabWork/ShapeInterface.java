interface Shape
{
	public double area;
	void calArea();
	void printArea()
	{
		System.out.println(area);
	}
}
class Circle implements Shape
{
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

class Rectangle implements Shape
{
	Rectangle(){}
	Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	void calArea()
	{
		area = length*breadth;
	}
	
}
class Square implements Shape
{
	Square(){}
	Square(double side)
	{
		this.side= side;
	}
	void calArea()
	{
		area= side*side;
	}
	
}

class ShapeInterface
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double radius;
		double length,breadth;
		double side;
		
		System.out.println("Enter the radius of circle: ");
		radius = sc.nextDouble();
		Circle c1 = new Circle(radius);
		c1.calArea();
		c1.printArea();
		
		System.out.println("Enter the length and breadth of rectangle: ");
		length = sc.nextDouble();
		breadth= sc.nextDouble();
		Rectangle rect = new Rectangle(length,breadth);
		rect.calArea();
		rect.printArea();
		
		
		System.out.println("Enter the side of the square: ");
		side = sc.nextDouble();
		Square sq= new Square(side);
		sq.calArea();
		sq.printArea();
		
		
		
		
	}
}