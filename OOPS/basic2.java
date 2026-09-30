/*Create a java Application with a class A having onr static variable two non-static variables and one parameterized constructor,non-static method m1() with parameter and return type and inherit properties from class A to class B having two static variable one non static variable,one static method m2() with parameter and return type.create a class 'test' having main method ,invoke m1() & m() under main method. condition: do not create class A object ,use dynamic inputs ,test class should not inheri A&B*/
import java.util.Scanner;
class A
{
	static int n=Test.sc.nextInt();
	boolean b=Test.sc.nextBoolean();
	String s=Test.sc.next();
	A(char ch)
	{
		System.out.print("1 st const"+ch);
	}
	float m1(String s)
	{
		System.out.print("m1"+s);
		return Test.sc.nextFloat();
	}
}
class B extends A
{
	static boolean b=Test.sc.nextBoolean();
	static int a=Test.sc.nextInt();
	boolean s=Test.sc.nextBoolean();
	static int m2(float f)
	{
		System.out.print("method 2"+f);
		return Test.sc.nextInt();
	}
	B()
	{
		super(Test.sc.next().charAt(0));
	}
}
class Test
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		B obj=new B();
		System.out.print("m1 res"+obj.m1(sc.next()));
		System.out.print("m2 res"+obj.m2(sc.nextFloat()));
	}
}
	
