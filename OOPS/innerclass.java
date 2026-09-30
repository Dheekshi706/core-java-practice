import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	private int a=sc.nextInt();
	class A1
	{
		int m1(boolean b)
		{
			System.out.print("m1 method"+b);
			System.out.print(a);
			return sc.nextInt();
		}
	}
	
		static class A2
		{
			char m3(boolean b)
			{
				System.out.print("m3"+b);
				return sc.next().charAt(0);
			}


		}


	
	String m4(boolean b)
	{
		class A3
		{
			int m5(char ch)
			{
				System.out.print("m5"+ch);
				return sc.nextInt();
			}
		
		}
		A3 obj3=new A3();
		System.out.print("m6"+obj3.m5(sc.next().charAt(0)));
		

		return sc.next();
	}
		
				
	
}
class Test 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		A obj=new A();
		A.A1 obj1=obj.new A1();
		System.out.print(obj1.m1(sc.nextBoolean()));
		A.A2 obj2=new A.A2();

		System.out.print(obj2.m3(sc.nextBoolean()));

		//System.out.print(A.m2(sc.nextInt()));
		System.out.print(obj.m4(sc.nextBoolean()));
		
	}
}
	
	