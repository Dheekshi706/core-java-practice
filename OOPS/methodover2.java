import java.util.Scanner;
class A
{
	static int a=Test.sc.nextInt();
	float f=Test.sc.nextFloat();
	A(boolean b)
	{
		System.out.print("A class"+b);
	}
	A()
	{
		System.out.print("default");
	}
	
	
}
class B extends A
{
	static int b=Test.sc.nextInt();
	int c=Test.sc.nextInt();
	boolean m1(int a)
	{
		System.out.print("m1"+a);
		return Test.sc.nextBoolean();
	}
	B(int a,boolean b)
	{
		System.out.print(a+""+b);
	}
	B(boolean b)
	{
		super(Test.sc.nextBoolean());
	}	
}
class C extends B
{
	static Scanner sc=new Scanner(System.in);
	static int b=Test.sc.nextInt();
	boolean bc=Test.sc.nextBoolean();
	C(B obj)
	{
		super(Test.sc.nextInt(),Test.sc.nextBoolean());
	}
}
class Test{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		C obj=new C(new B(sc.nextBoolean()));
		obj.m1(sc.nextInt());
		System.out.print(C.b);
		System.out.print(obj.bc);
		
	}
}
		
		

		