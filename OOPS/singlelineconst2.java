//single line calling without object
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.print("hi");
	}
	A(int a)
	{
		System.out.print(a);
	}
	A(boolean b)
	{
		System.out.print(b);
	}

	public static void main(String[] args)
	{
		new A(new A(new A().sc.nextInt()).sc.nextBoolean());
	}
}
	