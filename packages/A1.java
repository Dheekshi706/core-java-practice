/*create java application where we have one package, it contains one concrete class with one nonstatic variable, one default constructer, one parameterized constructor, and one static method with parameter and return type, one abstract class contains one parametrized constructer, one abstract method, and one defined method with parameters and return types, two interfaces with respective individual one abstract methods and defined methods then we need to access all these features into the class of separate package, provide functionality for abstract method, and then invoke all these properties under main by providing dynamic inputs.*/
package pkg5;
import java.util.Scanner;
public class A1
{
	Scanner sc=new Scanner(System.in);
	public int a=sc.nextInt();
	public A1()
	{
		System.out.print("default");
	}
	public A1(int a)
	{
		System.out.print("para"+a);
	}	
	public static int m1(boolean b)
	{
		System.out.print("m1"+b);
		return 10;
	}
	

	public static abstract class A2
	{
		public A2(boolean b)
		{
			System.out.print("A1"+b);
		}
		public abstract int m3();
		public int m4(int a)
		{
			return a;
		}
	}
	public interface I1
	{
		int m5();

        	default void display1()
        	{
            		System.out.println("I1 defined method");
        	}
	}
	public interface I2
	{
		int m6();

        	default void display2()
        	{
            		System.out.println("I1 defined method");
        	}

	}
}


	
	
	
