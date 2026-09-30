import java.util.Scanner;
interface I1
{
	void m1();
}
class A implements I1
{
	void m2()
	{
		System.out.println("m2");
	}
	public void m1()
	{
		System.out.println(" class A m1 method");
	}
	
}
class B implements I1
{
	void m3()
	{
		System.out.println("m3");
	}
	public void m1()
	{
		System.out.println("CLASS B  m1 method");
	}
	
}
class C implements I1
{
	void m4()
	{
		System.out.println("m4");
	}
	public void m1()
	{
		System.out.println(" C m1 method");
	}
	
}
class Test
{
	void display(I1 obj,int n)
	{
		obj.m1();
		if(n==1)
		{
			A obj1=(A)obj;
			obj1.m2();
		}
		if(n==2)
		{
			B obj1=(B)obj;
			obj1.m3();
		}
		if(n==3)
		{
			C obj1=(C)obj;
			obj1.m4();
		}
			
	
	}
}
class Main
{
	public static void main(String[] args)
	{
		new Test().display(new A(),1);
		new Test().display(new B(),2);
		new Test().display(new C(),3);

	}
}
/*object class,runtime class,comparision
		/*System.out.print(obj.getClass().getSimpleName().equals("A"));
		if(obj.getClass().getSimpleName().equals("A"))
		{
			A obj1=(A)obj;
			obj1.m2();
		}
		if(obj.getClass().getSimpleName().equals("B"))
		{
			B obj1=(A)obj;
			obj1.m2();
		}
		if(obj.getClass().getSimpleName().equals("C"))
		{
			C obj1=(A)obj;
			obj1.m2();
		}*/
		/*(if(obj instanceof A)
		{
			A obj1=(A)obj;
			obj.m2();
		}
		if(obj instanceof B)
		{
			B obj1=(A)obj;
			obj.m3();
		}
		if(obj instanceof C)
		{
			C obj1=(A)obj;
			obj.m4();
		}
		if(obj instanceof A obj1)
		{
			//A obj1=(A)obj;
			obj1.m2();
		}
		if(obj instanceof B obj1)
		{
			//A obj1=(A)obj;
			obj1.m3();
		}
		if(obj instanceof C obj1)
		{
			//A obj1=(A)obj;
			obj1.m4();
		}*/





	
