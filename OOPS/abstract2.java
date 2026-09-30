/*create a java application with a class A having 2 undefined methods two parametrized constructors implement one undefined method from class B  and implement another method  from class C invoke both methods and execute both the constructors using dynamic inputs*/
import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract void m1(int a);
	abstract boolean m2(char ch);
	A(int a)
	{
		this(sc.nextInt(),sc.next());
		System.out.print(a);
	}
	A(int a,String s)
	{
		System.out.print(a+" "+s);
	}
	
	
}
abstract class B extends A
{
	void m1(int a)

	{
		System.out.print(a);
	}
	
	B()
	{
		super(sc.nextInt());
	}
}
class C extends B
{
	boolean m2(char ch)
	{
		System.out.print(ch);
		return sc.nextBoolean();

	}
}
class Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		C obj=new C();
		obj.m1(sc.nextInt());
		obj.m2(sc.next().charAt(0));
		

	}
}
