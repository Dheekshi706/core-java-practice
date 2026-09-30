class A{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static void m1(){
		System.out.println("M1 static method without parameters &return type");
	}
	void m2(){
		System.out.println(" M2 Non-static method without parameters &return type");
	}
	static void m3(boolean b){
		System.out.println("M3 static method with parameters &without return type: "+b);
	}
	void m4(String s){
		System.out.println("M4 Non-static method with parameters &without return type: "+s);
	}
	static char m5(){
		System.out.println("M5 static method without parameters &with return type");
		return sc.next().charAt(0);
	}
	int m6(){
		System.out.println("M6 Non-static method without parameters &with return type");
		return sc.nextInt();		
	}
	static int m7(long l){
		System.out.println("M7 static method with parameters &with return type"+l);
		return sc.nextInt();
	}
	float m8(double d){
		System.out.println("M8 static method with parameters &with return type"+d);
		return sc.nextFloat();
	}
	public static void main(String[] args){
		m1();
		A obj=new A();
		obj.m2();
		m3(sc.nextBoolean());
		sc.nextLine();
		obj.m4(sc.nextLine());
		System.out.println(m5());
		System.out.println(obj.m6());
		System.out.println(m7(sc.nextLong()));
		System.out.println(obj.m8(sc.nextDouble()));
		System.out.println("all method types completed");
	}
}

	
	
