import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	static boolean m1(int a)
	{
		System.out.println(a);
		return true;
	}
	static int m2(int n)
	{
		return n;
	}
	char m3(boolean b)
	{
		System.out.print(b);
		return sc.next().charAt(0);
	}
	public static void main(String[] args)
	{
		System.out.print(new A().m3(m1(m2(sc.nextInt()))));
	}
}
