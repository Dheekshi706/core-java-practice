import java.util.Scanner;
	class A
		{
			int n;
			String s;
		static Scanner sc=new Scanner(System.in);
		A()
		{
			System.out.println("No argument Constructor");	
		}
		A(int a,String s)
		{
			System.out.println(a);
			System.out.println(s);
		}	
		A(A obj)
		{
			System.out.println("copy constructor");
			System.out.println(obj.n);
			System.out.println(obj.s);
			System.out.println(obj);
		}
		public static void main(String[] args)
		{
			A obj=new A();
			A obj1=new A(sc.nextInt(),sc.next());
			A obj2=new A(obj);
		}
}
		
		
		