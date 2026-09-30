/*1.Create a java application where we have one package, it contains a concrete class with one nonstatic variable one parameterized constructor, and one ns method with parameter and return type then access all these properties into a class of a separate package by using the import keyword*/
package pkg3;
import java.util.Scanner;
public class A
{
	static Scanner sc=new Scanner(System.in);

	public int a=sc.nextInt();
	public A(boolean b)
	{
		System.out.print(b);
	}
	public int m1(int a)
	{
		return a;
	}
	public static void main(String[] args)
	{
		int a=10;
		System.out.print(a);
	}
}