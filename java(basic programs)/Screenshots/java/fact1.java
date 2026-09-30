class parent
{
	public void show1()
	{
		System.out.println("show1 method in base class");
	}
	public void show2()
	{
		System.out.println("show2 method in base class");
	}
}
class child extends parent
{
	
	public void show2()
	{
		System.out.println("shhfdk");
	}
}
public class fact1
{
	public static void main(String args[])
	{
		parent o1=new parent();
		parent o2=new child();
		System.out.println("CP");
		o1.show1();
		System.out.println("ew");
		o2.show2();
		System.out.println("ew");
		o2.show2();
	}
}
	