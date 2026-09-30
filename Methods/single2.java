import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	static A m1(boolean a)
	{
		System.out.println("m1 method: "+a);
		A obj=new A();
		return obj;
	}
	boolean m2(char ch)
	{
		System.out.print("m2 method: "+ch);
		return sc.nextBoolean();
	}
	static char m3(int a)
	{
		System.out.print("m3 method: "+a);
		return sc.next().charAt(0);
	}
	public static void main(String[] args)
	{
		System.out.print(m1(sc.nextBoolean()).m2(m3(sc.nextInt())));
	}
}
