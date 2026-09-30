/* 5. create a java application where we have one abstract class it contains one abstract method, one defined method, and one parameterized constructor, and one interface it contains one abstract method and one defined method then, provide the implementation for both abstract class and interface by using anonymous inner classes by providing dynamic inputs. (anonymous2.java) */
import java.util.Scanner;

abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(boolean b);
	boolean m2(int a)
	{
		System.out.print("m2"+a);
		return sc.nextBoolean();
	}
	A(char ch)
	{
		System.out.print("A const"+ch);
	}
}
interface I
	{
	static Scanner sc=new Scanner(System.in);

		char m3(int a);
		default String m4(boolean b)
		{
			System.out.print("m4");
			return sc.next();
		}
	}
class B
{
	static Scanner sc=new Scanner(System.in);

	A obj=new A(sc.next().charAt(0))
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
	I obj1=new I()
	{
		public char m3(int a)
		{
			System.out.print("m3 method"+a);
			return sc.next().charAt(0);
		}
		public String m4(boolean b)
		{
			System.out.print("m4 method"+b);
			return sc.next();
		}
	};
		
	
	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.obj.m1(sc.nextBoolean());
		obj1.obj.m2(sc.nextInt());
		obj1.obj1.m3(sc.nextInt());
		obj1.obj1.m4(sc.nextBoolean());


	}
}
