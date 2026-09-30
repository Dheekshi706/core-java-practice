import java.util.Scanner;
class A{
	boolean b=sc.nextBoolean();
	static Scanner sc=new Scanner(System.in);
	static double d=sc.nextDouble();
	static long l=sc.nextLong();
	String s=sc.next();
	void m1(int a,boolean b){
		System.out.println(a);
		System.out.println(b);
	
		System.out.println("hi this is method");
	}
	static int m2(int a,int b){
		return a+b;
	}

	public static void main(String[] args){
		A obj=new A();
		obj.m1(sc.nextInt(),sc.nextBoolean());
		m2(sc.nextInt(),sc.nextInt());
	}
}