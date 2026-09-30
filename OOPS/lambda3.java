/*create a java application there we have to create one interfeace with single abstract method and two defined methods with must have a different parameters and return values then provide functionalities this interface 3 different ways a by using noramal concreate class,by using ananonymous inner class ,by using arrow tokens(lambda expression)*/
import java.util.Scanner;
interface I
{
	static Scanner sc=new Scanner(System.in);
	int m1(boolean b);
	default boolean m2(int a)
	{
		System.out.print("m2"+a);
		return sc.nextBoolean();
	}
	default String m3(char ch)
	{
		System.out.print("m3"+ch);
		return sc.next();
	}
}
/*class A
{
	static Scanner sc=new Scanner(System.in);
	public int m1(boolean b)
	{
		System.out.print("m1"+b);
		return sc.nextInt();
	}
	public boolean m2(int a)
	{
		System.out.print("m2"+a);
		return sc.nextBoolean();
	}
	public String m3(char ch)
	{
		System.out.print("m3"+ch);
		return sc.next();
	}
	public static void main(String[] args)
	{
		A obj=new A();
		obj.m1(sc.nextBoolean());
		obj.m2(sc.nextInt());
		obj.m3(sc.next().charAt(0));
	}
}*/
/*class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	I obj=new I()
	{
		public int m1(boolean b)
		{
			System.out.print("m1"+b);
			return sc.nextInt();
		}
		public boolean m2(int a)
		{
			System.out.print("m2"+a);
			return sc.nextBoolean();
		}
		public String m3(char ch)
		{
			System.out.print("m3"+ch);
			return sc.next();
		}

	};
	
		obj.m1(sc.nextBoolean());
		obj.m2(sc.nextInt());
		obj.m3(sc.next().charAt(0));
	}
}*/
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	I obj=(boolean b)->
	{
		System.out.print("m1 method"+b);	
		return sc.nextInt();
	};

	I obj1=(int a)->
	{
		System.out.print("m2 method"+a);
		return sc.nextBoolean();

	};

	I obj3=(ch)-> 
	{
		System.out.print("m3"+ch);
		return sc.nextInt();


	};
	
	obj.m1(sc.nextBoolean());
	obj1.m2(sc.nextInt());
	obj3.m3(sc.next().charAt(0));	
	}
}





	