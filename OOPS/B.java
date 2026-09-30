class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
}
class B extends A
{
	public static void main(String[] args)
	{
		int b=sc.nextInt();
		void m1()
		{
			System.out.print(b);
			System.out.print(a);
		}
	}
}