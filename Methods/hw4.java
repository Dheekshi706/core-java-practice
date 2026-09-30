import java.util.Scanner;
class A{
	static Scanner sc=new Scanner(System.in);
	static int m1(A x ,int a,int b){
		int res=x.m2(a,b);
		return res;
		
	}
	int m2(int x,int y){
		System.out.println("method");
		return x+y;
	}
	public static void main(String[] args){
		A obj=new A();
		System.out.println(m1(obj,sc.nextInt(),sc.nextInt()));
	}
}