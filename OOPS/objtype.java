import java.util.Scanner;
class A
{
	static void m1()
	{
		System.out.print("hi");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.print("hello");
	}
}
class Main
{
	public static void main(String[] args)
	{
		A obj=new B();
		B obj1=(B)obj;
		obj.m1();
		obj1.m1();
	}
}