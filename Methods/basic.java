import java.util.Scanner;
class A
	{
		static Scanner sc=new Scanner(System.in);
		static A m1(int a)
		{
			System.out.print("m1");
			return new A();

		}
		static char m2(boolean b)
		{
			System.out.print("m32");
			return sc.next().charAt(0);
		}
		int m3(char ch)
		{
		
			System.out.print("m32");
			return sc.nextInt();
		}
		public static void main(String[] args)
		{
			m1(sc.nextInt()).m3(m2(sc.nextBoolean()));
		}
}
