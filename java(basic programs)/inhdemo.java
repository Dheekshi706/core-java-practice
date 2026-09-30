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
		System.out.println("2child class");
	}
}
	

 class inhdemo
 {
	 
	public static void main(String args[])
	{
		
		C c1=new C();
		c1.f1();
		c1.f2();
		c1.f3();
		
	}
}