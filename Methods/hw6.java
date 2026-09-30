import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	static A m1(char ch)
	{
		return new A();
	}
	double m2(int x)
	{
		return sc.nextDouble();
	}


	public static void main(String[] args)
	{
		A obj=m1('#');
		double d=obj.m2(sc.nextInt());
		System.out.print(d);
	}
}