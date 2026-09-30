class parent
{
	public void show1()
	{
		System.out.println("show1 method in base class:" );
	}


	public void show2()
	{
		System.out.println("show2 method in base class:" );
	}
}
class child extends parent
{
	public void show2()
	{
		System.out.println("show2 method in child class:" );
	}
	
}
public class runtmdemo
  {
    public static void main(String args[])
	{
		parent o1=new parent();
		parent o2=new child();
		System.out.println("call by parent objetct: ");
		o1.show1();
		System.out.println("call by child objetct: ");
		o2.show2();
		System.out.println("call by child objetct: ");
	    o2.show2();
	}
  }
  
  
	
	