import java.util.Scanner;
class A{
		A (int a)
		{
			System.out.print(a);
		}
		A(A obj)
		{
			System.out.print("copy constructor");
		}
		A(int a,double d)
		{
			System.out.print(a+" "+d+" ");
		}
		public static void main(String[] args)
		{
			A x1=new A(10);
			A x2=new A(10,25);
			A x3=new A(x1);
			A x4=new A(x2);
			A x5=new A(x4);
		}
}