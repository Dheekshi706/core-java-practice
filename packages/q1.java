/*1.Create a java application where we have one package, it contains a concrete class with one nonstatic variable one parameterized constructor, and one ns method with parameter and return type then access all these properties into a class of a separate package by using the import keyword*/
package pkg3;
public class A
{
	int a=sc.nextInt();
	A(boolean b)
	{
		System.out.print(b);
	}
	int m1(int a)
	{
		return a;
	}
}