/*4. create java application where we have one class, it contains one method with parameter and return type, inside this class, we have another class that is static, here also we have one method with parameter and return type then invoke these two methods under the main by providing dynamic inputs.(static inner.java)*/
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int m1(boolean b)
	{
		System.out.print("m1 method");
		return sc.nextInt();
	}
	static class A1
		{
		String m2(int a)
		{
			System.out.print("m2"+a);
			return sc.next();
			
		}

	}

	
	public static void main(String[] args)
	{
		A obj=new A();
		obj.m1(sc.nextBoolean());
		A.A1 obj1=new A1();
		obj1.m2(sc.nextInt());
		
		

	}
}
