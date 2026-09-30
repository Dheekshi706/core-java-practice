/* craete a java Application with a class A having one static variable one non-static variables and parameterized  constructor inherits these properties to class B having one static variable one non static variable one single parameterized constructor & one non-static method m1() this has to print the variables of class A &B ,inherits these properties to class C having one ststic variable ,onre non-static variable one object parameterized constructor . create a class 'Test' with main method execute all the constructor ,invoke m1() & print the variable of c from main method.use dynamic inputs*/  
import java.util.Scanner;
class A
{
	static double d=Test.sc.nextDouble();
	String s=Test.sc.next();
	A(boolean b)
	{
		System.out.print(b);
	}
}
class B extends A
{
	static long l=Test.sc.nextLong();
	float f=Test.sc.nextFloat();
	B(char ch)
	{
		super(Test.sc.nextBoolean());
		System.out.print(ch);
	}
	B(int a,boolean b)
	{
		this(Test.sc.next().charAt(0));
		System.out.print(a+" " +b);
	}
	void m1()
	{
		System.out.print(d);
		System.out.print(l);
		System.out.print(s);
		System.out.print(f);
	}
}
class C extends B
{
	static int x=Test.sc.nextInt();
	boolean b=Test.sc.nextBoolean();
	C(C obj)
	{
		super(Test.sc.nextInt(),Test.sc.nextBoolean());
	}
	C()
	{
		super (Test.sc.next().charAt(0));
	}
}
class Test
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		C obj=new C(new C());
		obj.m1();
		System.out.print(obj.b);
		System.out.print(C.x);
	}
}

		