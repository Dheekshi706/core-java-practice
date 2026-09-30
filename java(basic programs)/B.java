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
}
class C extends B 
{
	void f3()
	{
		System.out.println("c class");
    }


	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		a1.f1();
		b1.f2();
		c1.f3();
	}
}