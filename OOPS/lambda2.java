import java.util.Scanner;
interface Demo
{
	String m1(String s);
}
class A 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	Demo obj=(s)-> s.toUpperCase();
	Demo obj1=(s)-> s.toLowerCase();
	System.out.print(obj.m1(sc.next()));
	System.out.print(obj1.m1(sc.next()));


	}
}