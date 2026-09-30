import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
		System.out.println(a);
	}
	void m1()
	{
		System.out.println("m1 method");
	}
}
class B extends A
{
	B(A obj)
	{
		super(sc.nextInt());
		m2(this);
	}
	static void m2(B obj)
	{
		obj.m1();
		System.out.print("m2");
	}
	
	public static void main(String[] args)
	{
		B obj= new B(new A(sc.nextInt()));
		
		
	}
}