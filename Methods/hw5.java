import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	static int m1(A obj)
	{
		System.out.println(obj.m2(sc.nextInt()));
		return sc.nextInt();
	}
	double m2(int n)
	{
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		A obj=new A();
		System.out.println(m1(obj));
	}
}
		