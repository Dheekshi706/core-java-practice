/*9. create a java application where we have one interface it contains one abstract and one defined method, inside this interface we have two concrete classes with respect to individual methods, provide an implementation for the interface then invoke all these methods under the main with dynamic inputs. (IC.java)*/
import java.util.Scanner;
interface I
{
	void m1();
	default void m2(){
		System.out.print("m2");
	}
	class A
	{
		void m3()
		{
			System.out.print("m3");
		}
	}
	class B
	{
		 void m4()
		{
			System.out.print("m4");
		}
	}	
}
class Test{
	public static void main(String[] args)
	{
	I obj2=new I(){
	public void m1()
	{
		System.out.print("m1");
	}
	public void m2()
	{
		System.out.print("m2");
	}

	};
	Test t=new Test();
	obj2.m1();
	obj2.m2();
	I.B obj1=new I.B();
	obj1.m4();
	I.A obj3=new I.A();
	obj3.m3();	
}
	
}
















/*import java.util.Scanner;
interface I
{
	void m1();
	interface I2
	{
		void m2();
		default void m3()
		{
			System.out.print("m3");
		}
		abstract class A
		{
			abstract void m4();
			A(int a)
			{
				System.out.print("hi");
			}
			class B
			{
				void m5()
				{
					System.out.print("helli");
				}
			}
		}
	}
}
class Demo
{
	I obj=new I()
	{
		public void m1(){
			System.out.print("m1");
	}
	};
	I.I2 obj1=new I.I2()
	{
		public void m2(){
		System.out.print("m2");
	}
		public void m3(){
			System.out.print("m3");
		}

	};
	I.I2.A obj2=new I.I2.A(10)
	{
			public void m4(){
			System.out.print("m4");
	}
	};
	
	I.I2.A.B obj3=obj2.new B()
	{
			public void m5(){
			System.out.print("m5");
	}
	};
	

	
	
}
class Test
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.obj.m1();
		d.obj1.m2();
		d.obj1.m3();
		d.obj2.m4();
		d.obj3.m5();



	}
}*/

