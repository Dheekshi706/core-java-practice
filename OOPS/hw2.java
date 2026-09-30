import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.print("default");
	}
	A(A obj)
	{
		System.out.print("param");
	}
	A(A obj,String s)
	{
		System.out.print("param1");
	}
		
	public static void main(String[] args)
	{
		new A(new A(new A()),sc.next());
	}
}