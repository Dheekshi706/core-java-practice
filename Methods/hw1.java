class A{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static A obj=new A();////
	static void m1(int a,int b){
		System.out.println("m1 calling");
		System.out.println(a*b);
	}
	int m2(){
		m1(sc.nextInt(),sc.nextInt());
		System.out.println("m2 calling");
		return sc.nextInt();
	}
	static void m3(){
		System.out.println(obj.m2());	
		System.out.println("m3 calling");
	}
	float m4(Boolean b){
		m3();
		System.out.println("m4 calling:"+b);
		return sc.nextFloat();
	}
	public static void main(String[] args){		
		System.out.println(obj.m4(sc.nextBoolean()));
		System.out.println("main method ending");
	}
}
		
	