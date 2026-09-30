class a
{
	int a=100;
}
class b extends a
{
	int b=34;
}
class deepu
{
	public static void main(String args[])
	{
		int c=a+b;
		b ob=new b();
		System.out.println("result"+c);
	}
}
