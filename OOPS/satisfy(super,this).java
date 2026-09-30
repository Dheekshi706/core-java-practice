//satisfy super and this keyword from varible,method,and constructor level.
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	void m1(int a)
	{
		System.out.println("class A method");
	}
	A(String s)
	{
		System.out.println("a comnst"+s);
	}
}
class B extends A
{
	int a=sc.nextInt();
	void m1(int a)
	{
		System.out.println("local"+a);
		System.out.println("chiled"+this.a);
		System.out.println("parent"+super.a);
		super.m1(sc.nextInt());
	}
	void m1()
	{
		this.m1(sc.nextInt());
		System.out.print("m1 com");
	}
	B(String s)
	{
		super(sc.next());
		this.m1();
		System.out.print("B class "+s);
	}
	B(int a)
	{
		this(sc.next());
		System.out.print(a);
	}
}
class Main
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
		B obj=new B(sc.nextInt());
	}
}
		