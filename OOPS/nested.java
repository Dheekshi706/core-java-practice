/* create a java application where we have one interface it contains one abstract method and one defined method, inside this interface we have two interfaces with respect to individual abstract methods, then provide an implementation for all these interfaces into one concrete class and then invoke all these methods by providing dynamic inputs. (nested.java) */
import java.util.Scanner;

interface I
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(boolean b);
	default boolean m2(int a)
	{
		System.out.print("m2"+a);
		return sc.nextBoolean();
	}
	interface I1
	{
		char m3(int a);
	}
	interface I2
	{
		char m4(boolean b);
	}
}
class A
{
	static Scanner sc=new Scanner(System.in);
	I obj=new I()
	{
		public int m1(boolean b)
		{
			System.out.print("m1 method"+b);
			return sc.nextInt();
		}
		public boolean m2(int a)
		{
			System.out.print("m2 method"+a);
			return sc.nextBoolean();
		}
	};
	I.I1 obj2=new I.I1()
	{
		public char m3(int a)
		{
			System.out.print("m3"+a);
			return sc.next().charAt(0);
		}
	};
	I.I2 obj3=new I.I2()
	{
		public char m4(boolean b)
		{
			System.out.print("m4"+b);
			return sc.next().charAt(0);
		}
	};
	
	public static void main(String[] args)
	{
		A obj1=new A();
		obj1.obj.m1(sc.nextBoolean());
		obj1.obj.m2(sc.nextInt());
		obj1.obj2.m3(sc.nextInt());
		obj1.obj3.m4(sc.nextBoolean());


	}
}
