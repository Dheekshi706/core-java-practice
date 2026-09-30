import java.util.Scanner;
class A
{
	static int n=Test.sc.nextInt();
	boolean b=Test.sc.nextBoolean();
	A(int a)
	{
		System.out.print("param");
	}
	
}
class B extends A
{
	static int n1=Test.sc.nextInt();
	int b1=Test.sc.nextInt();
	B(boolean b)
	{
		super(Test.sc.nextInt());
		System.out.print("B class"+b);
	}
	B(int a,boolean b)
	{
		this(Test.sc.nextBoolean());
		System.out.print("B double"+a+" " +b);
	}
	
	void m1()
	{
		System.out.print(n);
		System.out.print(b);
		System.out.print(n1);
		System.out.print(b1);
	}
	
}
class C extends B
{
	static int b2=Test.sc.nextInt();
	int n2=Test.sc.nextInt();
	C(C obj)
	{
		super(Test.sc.nextInt(),Test.sc.nextBoolean());
	}
	C()
	{
		super(Test.sc.nextInt(),Test.sc.nextBoolean());
	}
}class Test
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
		C obj=new C(new C());
		obj.m1();
		System.out.print(obj.n2);
		System.out.print(C.b2);
	}
}
	










