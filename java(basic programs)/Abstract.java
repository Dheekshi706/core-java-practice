abstract class shape
{
	abstract public void area();
}
class sqr extends shape
{
	double sd;
	sqr()
	{
		sd=0;
	}
	sqr(double s)
	{
		sd=s;
	}
	public void area()
	{
		System.out.println("area of sqr "+sd+" is" +sd*sd);
	}
}
class Rect extends shape
{
	double ln,br;
	Rect()
	{
		ln=0;br=0;
	}
	Rect(double l,double b)
	{
		ln=l;br=b;
	}
	public void area()
	{
		System.out.println("area of Rect "+ln+","+br+" is" +ln*br);
	}
}

class circle extends shape
{
	double rad;
	circle()
	{
		rad=0;
	}
	circle(double r)
	{
		rad=r;
	}
	public void area()
	{
		System.out.println("area of circle "+rad+"is" +rad*rad*math.PI);
	}
}
public class Abstract
{
	public static void main(String args[])
	{
		shape o;
		sqr s1=new sqr(14);
		Rect r1=new Rect(10,20);
		circle c1=new circle(10);
		o=s1;
		o.area();
		o=r1;
		o.area();
		o=c1;
		o.area();
	}
}
