import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	boolean b=sc.nextBoolean();
	A(int a,boolean b)
	{
		this.a=a;
		this.b=b;
	}
	void m1(int a)
	{
		System.out.print("m1 method");
	}
	//void m2(boolean b)
	//{
		//this.sc.nextInt();
	//}
	A()
	{
		System.out.print("hi");
	}
}
class B extends A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	B(boolean b)
	{
		super(sc.nextInt(),sc.nextBoolean());
	}
	void m1(int a)
	{
		System.out.print(super.a);
		System.out.print(this.a);
		System.out.print("parent method");
		
	}
	B()
	{
		super.m1(sc.nextInt());
		this.m1(sc.nextInt());
	}

	B(String s)
	{
		this(sc.nextBoolean());
	}
	public static void main(String[] args)
	{
		B obj=new B(sc.nextBoolean());
		obj.m2();
	}
}
	

	