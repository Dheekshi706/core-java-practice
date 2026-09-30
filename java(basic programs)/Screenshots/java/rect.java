import java.util.Scanner;
class Rectangle
{
	double length,width;
	void read_attributes()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enetr num");
	length=s.nextDouble();
	System.out.println("enter width");
	width=s.nextDouble();
	}
void perimeter()
{
double perimeter=2*(length+width);
System.out.println("perimeter="+perimeter);
}
void Area()
{
double area=length*width;
System.out.println("area="+area);
}
}
class DemoRectangle
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.read_attributes();
r.area();
r.perimeter();
}
}




		