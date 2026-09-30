class Baseclass
{
	int z;
	public void add(int a,int b)
	{
		z=x+y;
		System.out.println("parent class method:addition of "+x+","+y+" is "+z);
	}
	public void sub(int a,int b)
	{
		z=x-y;
		System.out.println("parent class method:subtration of "+x+","+y+" is" +z);
	}
}
class subclass extends Baseclass
{
	int z;
	public void mult(int a,int b)
	{
		z=x*y;
		System.out.println("child class method:subtration of "+x+"and"+y+" is"+z);

	}
}
public class inherdemo
{
	public static void main(String args[])
	{
		int x=20,y=10;
		subclass casm=new subclass();
		casm.add(x,y);
		casm.sub(x,y);
		casm.mult(x,y);
	}
}

	
	