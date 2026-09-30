import java.util.Scanner;
class A
{
	static String name=Test.sc.next();
	int id=Test.sc.nextInt();
	A(int a)
	{
		System.out.print("Default Constructor");
	}
}
class B extends A
{	
	static boolean bo=Test.sc.nextBoolean();
	String na=Test.sc.next();
	B(boolean b)
	{
		super(Test.sc.nextInt());
		System.out.print(b);
	}
	B(int a,boolean b)
	{
		this(Test.sc.nextBoolean());
	}
	void m1()
	{
		System.out.print(name);
		System.out.print(id);
		System.out.print(bo);
		System.out.print(na);
	}
	

		
}
class C extends B
{
	boolean f=Test.sc.nextBoolean();
	C(C obj)
	{
		super(Test.sc.nextInt(),Test.sc.nextBoolean());
		System.out.print(obj);
	}
	C()
	{
		super(Test.sc.nextBoolean());
	}
	
}	

	
class Test
{	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		C obj=new C(new C());
		obj.m1();
		System.out.print(obj.f);	
	}

}
		