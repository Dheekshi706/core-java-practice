import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	char ch=sc.next().charAt(0);
	A(boolean b)
	{
		this(sc.next().charAt(0),sc.nextInt());
		System.out.print("c1 called");
	}
	A(char a,int n)
	{
		this(sc.next(),sc.nextInt());
		System.out.print("c2 called");
		
	}
	A(String s,int n)
	{
		System.out.print("c3 caled");
	}
	public static void main(String[] args)
	{
		A x1=new A(sc.nextBoolean());
	}
}	