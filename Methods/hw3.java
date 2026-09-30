class A{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static int m1(int a,int b){
		return a+b;
	}
	int m2(int a){
		if(a%2==0){
			return a*a;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args){
		int res=m1(sc.nextInt(),sc.nextInt());
		A obj=new A();
		System.out.println(res);
		int ans=obj.m2(res);
		System.out.println(ans);
			

		
	}
}
		
		
	