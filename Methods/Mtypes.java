import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	static int n=sc.nextInt();
	boolean b=sc.nextBoolean();
	float f=sc.nextFloat();
	static void m1(){
		System.out.println("static method without args");
	}
	static void m2(int a,boolean b){
		System.out.println("static with parameters");
		System.out.println(a);
		System.out.println(b);
	}
		
	static int add(int a,int b){
		return a+b;
	}
	void m3(){
		System.out.println("non static method");
	}
	void m4(int b,int a){
		System.out.println(b);
		System.out.println(a);
	}
	int sub(int a,int b){
		return a-b;
	}
	public static void main(String[] args){
		A obj=new A();
		m1();
		m2(sc.nextInt(),sc.nextBoolean());
		System.out.println(add(sc.nextInt(),sc.nextInt()));
		obj.m3();
		obj.m4(sc.nextInt(),sc.nextInt());
		System.out.println(obj.sub(sc.nextInt(),sc.nextInt()));
		
		
	}
}