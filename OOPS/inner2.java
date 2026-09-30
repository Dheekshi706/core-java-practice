import java.util.Scanner;
interface I
{
	static Scanner sc=new Scanner(System.in);
	int m1(boolean b);
	interface I2
	{
		boolean m2(int a);
		default String m3(boolean b)
		{
			System.out.print("m3");
			return sc.next();
		}
		abstract class A
		{
			abstract int m4(String s);
			A(int a)
			{
				System.out.print("A class");
			}	
			class B
			{
				int m5(boolean b)	
				{		
					System.out.print("m5");
					return sc.nextInt();
				}
			}
		}
	}
}
class Demo
{
	static Scanner sc=new Scanner(System.in);

	I obj=new I()
		{
			public int m1(boolean b)
			{
				System.out.print("m1");
				return sc.nextInt();
			}
		};
	I.I2 obj1=new I.I2()
		{
			public boolean m2(int b)
			{
				System.out.print("m2");
				return sc.nextBoolean();
			}
			public String m3(boolean b)
			{
				System.out.print("m3 method");
				return sc.next();
			}
			
		};
	I.I2.A obj2=new I.I2.A(sc.nextInt())
		{
		
		public int m4(String s)
			{
				System.out.print("m4 method"+s);
				return sc.nextInt();
			}
		};
	I.I2.A.B obj3=obj2.new B()
		{
			public int m5(boolean b)	
				{		
					System.out.print("m5");
					return sc.nextInt();
				}
		};

	
		
}
class Test
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.obj.m1(sc.nextBoolean());
		d.obj1.m2(sc.nextInt());
		d.obj1.m3(sc.nextBoolean());
		d.obj2.m4(sc.next());
		d.obj3.m5(sc.nextBoolean());

	}
}

	
