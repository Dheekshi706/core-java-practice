import java.util.Scanner;
class A
{
	static boolean a=Test.sc.nextBoolean();
	String s=Test.sc.next();
	A(float a)
	{
		System.out.print("first const");
		System.out.print(a);
	}
	A(boolean b,boolean s)
	{
		System.out.print("2 nd const");
	}
}
class B extends A
{
		int b=Test.sc.nextInt();
		static char ch=Test.sc.next().charAt(0);
		void m1()
		{
			System.out.println("hello guys");
			System.out.println(b);
			System.out.println(a);
			System.out.print(s);

		}
		B()
		{
			super(Test.sc.nextFloat());

		}
		
		
}
class Test
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		new A(sc.nextBoolean(),sc.nextBoolean());
		B obj=new B();
		obj.m1();
	}
}