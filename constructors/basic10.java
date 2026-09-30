import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	boolean b=sc.nextBoolean();
	int a=sc.nextInt();
	void m1(int a)
	{
		System.out.println("local"+a);
		System.out.println("current"+this.a);
	}
	A(String s)
	{
		System.out.print(s);
	}
}
class B extends A
		{
			static Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int a=sc.nextInt();
			void m1(int a)
			{
				super.m1(sc.nextInt());
				System.out.println("local"+a);
				System.out.println("current"+this.a);
				System.out.println("parent"+super.a);
			}
			void m1()
			{
				this.m1(sc.nextInt());
				System.out.println("hello");
			}
			B(int a)
			{
				super(sc.next());
				System.out.print(a);

			}
			B(String s)
			{
				this(sc.nextInt());
				System.out.print("last cons"+s);
			}
}
class Test
{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		B obj=new B(sc.next());
		obj.m1();
		
}
}
		



	
					