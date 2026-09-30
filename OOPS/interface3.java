/*Ssame method in diffent interfaces without overriding */
import java.util.Scanner;
interface I1
{
	default void m1(int a)
	{
		System.out.print("m1 method");
	}
}
interface I2
{
	default void m1(int a)
	{
		System.out.print("m3");
	}
}
class A implements I2,I1
{
	public void m1(int a)
	{
		System.out.print("hi");
	}
	void display()
	{
		I1.super.m1(10);
		I2.super.m1(20);
		m1(776);
	}
	public static void main(String[] args)
	{
		new A().display();
	
		
	}
		
}


