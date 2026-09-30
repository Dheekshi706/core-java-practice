import java.util.Scanner;
interface I
{
	int m1(boolean b);
}
interface I2
{
	boolean m2(int a);
}
class A 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	I obj=(b)->
	{
		System.out.print("m1 method"+b);	
		return sc.nextInt();
	};

	I2 obj1=(a)->
	{
		System.out.print("m2 method"+a);
		return sc.nextBoolean();
	};
		obj.m1(sc.nextBoolean());
	obj1.m2(sc.nextInt());
	}
}