/*create a java application with an interface I1 ,I2 having one undefined method and one defined method in each,create classs A having one y=undefined method method and one defined method and one parameterized constructor implement all the methods directly from class B ,invoke all the methods under main method ,each and every methods should have different parametrs and return type use dynamic inputs*/
import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(int a);
	default int m2(char ch)
	{
		System.out.print("m2 method"+ch);
		return sc.nextInt();
		
	}
}
interface I2 extends I1
{
	boolean m3(char ch);
	default char m4(Boolean b)
	{
		System.out.println("m4 method");
		return sc.next().charAt(0);
		
	}
}
abstract class A implements I2
{
	abstract int m5(int a);
	boolean m6(boolean b)
	{
		System.out.println("m5 method"+b);
		return sc.nextBoolean();
	}
	A(int a)
	{
		System.out.println("A class Constructor"+a);
	}
	A()
	{
		this(sc.nextInt());
		System.out.println("A class");
	}
}
class B extends A
{
	public int m1(int a)
	{
		System.out.println("m1 method"+a);
		return sc.nextInt();
	}
	public boolean m3(char ch)
	{
		System.out.println("m3 method"+ch);
		return sc.nextBoolean();
	}
	int m5(int a)
	{
		System.out.println("m5 method"+a);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		B obj=new B();
		System.out.print(obj.m1(sc.nextInt()));
		System.out.print(obj.m2(sc.next().charAt(0)));
		System.out.print(obj.m3(sc.next().charAt(0)));
		System.out.print(obj.m4(sc.nextBoolean()));
		System.out.print(obj.m5(sc.nextInt()));
		System.out.print(obj.m6(sc.nextBoolean()));
		
	}
}
		
		
