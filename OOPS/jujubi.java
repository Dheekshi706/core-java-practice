/*create a java application where we have one class, it contains one method with parameter and return type, inside this class we have another class it contains one more method with parameter and return type, inside this method we have two inner classes with respect to individual methods with parameters and return types. then invoke all these methods under the main method by providing dynamic inputs (jujubi.java)*/
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int m1(boolean b)
	{
		System.out.print("m1 method");
		return sc.nextInt();
	}
	class A1
		{
		String m2(int a)
		{
			class A2
			{
				boolean m3(int a)
				{
					System.out.print("M3"+a);
					return sc.nextBoolean();
				}
			}
			class A3
			{
				char m4(int a)
				{
					System.out.print("m4");
					return sc.next().charAt(0);
				}
			}
			A2 obj=new A2();
			obj.m3(sc.nextInt());
			A3 obj1=new A3();
			obj1.m4(sc.nextInt());
			return sc.next();
		}
					
		
	}

	
	public static void main(String[] args)
	{
		A obj=new A();
		obj.m1(sc.nextBoolean());
		A.A1 obj1=obj.new A1();
		obj1.m2(sc.nextInt());
		
		

	}
}
