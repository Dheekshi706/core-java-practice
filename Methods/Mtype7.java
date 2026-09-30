class A{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	String m1(int a){
		if(a%2==0){
			return "Even";
		}
		else{
			return "odd";
		}
	}
	public static void main(String[] args){
		A obj=new A();
		System.out.println(obj.m1(obj.sc.nextInt()));
	}
}