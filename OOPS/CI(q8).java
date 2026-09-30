/* create a java application where we have one class it contains one parameterized constructor, one method with a parameter, and a return type, inside this class we have one interface it contains one abstract method and two defined methods, provide an implementation for the interface and then invoke all the properties under main by providing dynamic inputs. (CI.java) */
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
		System.out.print("A const"+a);
	}
	int m1(boolean b)
		{
			System.out.print("m1 method"+b);
			return sc.nextInt();
		}
	interface I1
	{
		boolean m2(int a);
		default char m3(int a)
		{
			System.out.print("m3"+a);
			return sc.next().charAt(0);
		}
		default String m4(int a)
		{
			System.out.print("m4"+a);
			return sc.next();
		}
	}
	public static void main(String[] args)
	{
		A obj=new A(sc.nextInt());
		obj.m1(sc.nextBoolean());
		I1 obj1=new I1()
		{
			public boolean m2(int a)
			{
				System.out.print("m2 method"+a);
				return sc.nextBoolean();
			}
			public char m3(int a)
			{
				System.out.print("m3 method"+a);
				return sc.next().charAt(0);
			}
			public String m4(int a)
			{
				System.out.print("m4 method"+a);
				return sc.next();
			}

		};


		//obj1.obj.m1(sc.nextBoolean());
		obj1.m2(sc.nextInt());
		obj1.m3(sc.nextInt());
		obj1.m4(sc.nextInt());


	}
}
