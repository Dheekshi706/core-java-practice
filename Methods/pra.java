import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=10;
	String name="Deepu";
	A(int a,String name)
	{
		System.out.print(this.a);
		System.out.print(this.name);
		System.out.print(a);
		System.out.print(name);
	}
	public static void main(String[] args)
	{
		new A(sc.nextInt(),sc.next());
	}
}