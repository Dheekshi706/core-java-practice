import java.util.Scanner;
class A
{
	private String empname;
	private int empId;
	private double empsal;
	A(String empname,int empId,double empsal)
	{
		this.empname=empname;
		this.empId=empId;
		this.empsal=empsal;
	}
	String getName()
	{
		return empname;
	}
	int getId()
	{
		return empId;
	}
	double getSal()
	{
		return empsal;
	}
	void setPin(double sal)
	{
		this.empsal=sal;
	}
}
class Main
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		A x=new A(sc.next(),sc.nextInt(),sc.nextDouble());
		System.out.println(x.getName());
		System.out.println(x.getId());
		System.out.println(x.getSal());
		A x1=new A(sc.next(),sc.nextInt(),sc.nextDouble());
		System.out.println(x1.getName());
		System.out.println(x1.getId());
		System.out.println(x1.getSal());
		x.setPin(2000);
		System.out.println(x.getSal());
		
	}
}