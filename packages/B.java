package pkg4;
import pkg3.A;
import java.util.Scanner;
public class B
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{
	A obj=new A(sc.nextBoolean());
	System.out.print(obj.m1(sc.nextInt()));
	System.out.print(obj.a);
	}
}