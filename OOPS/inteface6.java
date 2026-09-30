/*create a java application where we have 1 abstract class with 2 abstract methods and one defined method with different parameters and return type we have 1 interface with one abstract method and 1 defined method then we have separate class like a test with 1 non static method like a Display having a parameter as a abstract class its return interface object then we have to invoke those methos inside display method by providing functional for abstractive class by using extents and implements */
import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract void m1(int a);
	abstract void m2(boolean b);
	int m3(boolean b)
	{
		System.out.print("m3");
		return sc.nextInt();
	}
}
	
interface I1 
{
	static Scanner sc=new Scanner(System.in);
	
	default void m4(int a)
	{
		System.out.print("m4 parent"+a);
	}
	boolean m5(int a);
}
class Test 
{
	static Scanner sc=new Scanner(System.in);

	
	I1 obj1=(int a)->{
	
		System.out.print("m5"+a);
		return sc.nextBoolean();
	} ;
	I1 display(A obj)
	{
		obj.m1(10);
		obj.m2(sc.nextBoolean());
		System.out.print(obj.m3(true));

		obj1.m4(20);
		obj1.m5(765);
		return obj1;
	}

		
		
	public static void main(String[] args)
	{
		Test obj1=new Test();
		A obj=new A(){
		void m1(int a)
		{
			System.out.print("m1"+a);
		}
		void m2(boolean b)
		{
			System.out.print("m2"+b);
		}
	};	
		obj1.display(obj);
	}

}
