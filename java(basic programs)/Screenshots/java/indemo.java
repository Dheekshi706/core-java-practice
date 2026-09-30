class A
{
	void f1()
	{
		System.out.println("BASE CLASS");
	}
}
class B extends A 
{
	void f2()
	{
		System.out.println("child class");
    }

    
	public static void main(String args[])
	{
		
		B b1=new B();
		b1.f1();
		b1.f2();
		
	}
}