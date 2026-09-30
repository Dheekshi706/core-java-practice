/*3. Create a java application where we have one main package it contains one concrete class with one parameterized constructor static method with parameter and return type, a non-static method with parameter and return type, one abstract class with one parameterized constructor one abstract and defined methods with parameter and return type, one interface with the static(defined) and non-static(abstract) method with parameter and return type with respect to this package we have one subpackage it contains two interfaces with respect to individual both abstract methods and defined methods with parameter and return type then access all these features into the class of separate package provide functionality for abstract methods then invoke all under the main method by providing dynamic inputs*/
package p3;
import java.util.Scanner;
public class p1
{
	static Scanner sc=new Scanner(System.in);
	public p1(int a)
	{
		System.out.print("P1 CONST");
	}
	
	public static boolean m1(int a)
	{
		System.out.println(a+"m1");
		return sc.nextBoolean();
	}
	public  int m2(int a)
	{
		System.out.println(a+"m2");
		return sc.nextInt();
	}
	public static abstract class pa1
	{
		public pa1(int a)
		{
			System.out.print("P1 CONST"+a);
		}
		public abstract int m3(int a);
		public int m4(int b) 
		{
			 return b;
		}
	}
	public interface I
	{
		public static int m5(int a)
		{
			return a;
		}

		public boolean m6(int b);
	}
}


		
		
		

	
	