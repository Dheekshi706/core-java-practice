/* create a java application with a an interface I having one variable ,one defined non static method,one undefined method,create interface I2 having two undefined methods and one static defined method implement all undefined methods from class Demo ,create static display method with I2 object as parameter and returns nothing,invoke all the methods under display method and invoke display method under main method 
condition :object of class Demo should not be created glovbally not inside display method*/
import java.util.Scanner;
interface I
{
	int a=10;
	default void m1()
	{
		System.out.print("m1 method");
	}
	void m2(int a);
}
interface I1 extends I
{
	void m3(int a);
	void m4(char ch);
	static void m5(int a)
	{
		System.out.print("m5 method"+a);
	}
}
class Demo implements I1
{
	static Scanner sc=new Scanner(System.in);
	public void m2(int a)
	{
		System.out.print("m2 method"+a);
	}
	public void m3(int a)
	{
		System.out.print("m3 method"+a);
	}
	public void m4(char ch)
	{
		System.out.print("m4 method"+ch);
	}
	static void display(I1 obj)
	{
		obj.m1();
		obj.m2(sc.nextInt());
		obj.m3(sc.nextInt());
		obj.m4(sc.next().charAt(0));
		I1.m5(sc.nextInt());
		System.out.print(I.a);
	}
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		display(obj);
	}
}
	