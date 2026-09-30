class B{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		B obj=new B();
		int res=obj.add(sc.nextInt(),sc.nextInt());
		if(res%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("odd");
		}
	}
}