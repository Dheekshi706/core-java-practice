/*create java application where we have one class that contains one private variable and one method with parameter and return type, inside this class, we have two inner classes, which contain one method with parameter and return type individually, these methods have to access the private variable and then we need to invoke all these methods under main by providing dynamic inputs (innerclass.java)*/
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	private int a1=10;
	int m1(boolean b)
	{
		System.out.print("m1"+b);
		System.out.print(a1);
		return sc.nextInt();
	}
	class A1
	{
		boolean m2(int a)
		{
			System.out.print("M2"+a);
			System.out.print(a1);

			return sc.nextBoolean();
		}
	}
	class A2
	{
		String m3(int a)
		{
			System.out.print("M2"+a);
			System.out.print(a1);
			return sc.next();
		}
	}
	public static void main(String[] args)
	{
		A obj=new A();
		obj.m1(sc.nextBoolean());
		A.A1 obj1=obj.new A1();
		obj1.m2(sc.nextInt());
		A.A2 obj2=obj.new A2();
		obj2.m3(sc.nextInt());

		

	}
}



