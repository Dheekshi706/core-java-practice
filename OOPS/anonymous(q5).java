/* 5. create a java application where we have one interface, which contains two abstract methods then provide an implementation for this interface by using an anonymous inner class and then invoke all these methods under main by providing dynamic inputs. (anonymous.java)*/
import java.util.Scanner;
interface I
{
	int m1(boolean b);
	boolean m2(int a);
}
class A
{
	static Scanner sc=new Scanner(System.in);

	I obj=new I()
	{
		public int m1(boolean b)
		{
			System.out.print("m1 method");
			return sc.nextInt();
		}
		public boolean m2(int a)
		{
			System.out.print("m2 method");
			return sc.nextBoolean();
		}
	};
		
	
	public static void main(String[] args)
	{
		A obj1=new A();
		obj1.obj.m1(sc.nextBoolean());
		obj1.obj.m2(sc.nextInt());
		
		

	}
}
