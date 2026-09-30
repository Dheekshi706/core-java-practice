/*create a java application with a class A having undefinesd method m1 with parameter and return type and one defined non static method m2 with parameter and return type and one single parameerized constructor. implement defined,undefined method from class B,B class Also having non static method m3  with parameter and return type ,create class Test having one static method display() with A class object as a Parameter and invoke m1 &m2,m3  under display method .invoke display method under main method .condition: class B object should not be created globally and not inside the display method, it should be created only once, use dynamic inputs. */
import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(int a);
	boolean m2(char ch)
	{
		System.out.println("m2 method"+ch);
		return sc.nextBoolean();
	}
	A(boolean b)
	{
		System.out.println("a const"+b);
	}
		
}
class B extends A
{
	int m1(int a)

	{
		System.out.println("m1 method"+a);
		return sc.nextInt();
	}
	
	String m3(boolean b)
	{
		System.out.println("m3 method"+b);
		return sc.next();
	}
	
	B()
	{
		super(sc.nextBoolean());
	}
}
class Test 
{	
	static Scanner sc=new Scanner(System.in);
	static void display(A obj)
	{
		B obj1=(B)obj;
		obj.m1(sc.nextInt());
		System.out.print(obj.m2(sc.next().charAt(0)));
		System.out.print(obj1.m3(sc.nextBoolean()));


	}
	public static void main(String[] args)
	{
		A obj=new B();
		display(obj);

	}

 
}

