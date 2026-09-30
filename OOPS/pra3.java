import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
		System.out.print("default"+a);
		
	}
	boolean m1(int a)
	{
		System.out.print(a);
		return sc.nextBoolean();
	}
}
class B extends A
{
	static Scanner sc=new Scanner(System.in);
	B(A obj)
	{
		super(sc.nextInt());
		m2(this);
	}
	static void m2(B obj)
	{
		obj.m1(sc.nextInt());
	}


	public static void main(String[] args)
	{
		new B(new A(sc.nextInt()));
	}
}
