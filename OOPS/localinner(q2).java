/*create a java application where we have one class that contains one method with parameter and return type, inside this method we have one inner class which contains two methods with parameters and return types then invoke all these methods by providing Dynamic inputs. (localinner.java)*/
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int m1(boolean b)
	{
		class A1
		{
			String m3(int a)
			{
				System.out.print("M2"+a);
				return sc.next();
			}
			boolean m2(int a)
			{
				System.out.print("M2"+a);
				return sc.nextBoolean();
			}
		}
		A1 obj=new A1();
		obj.m3(sc.nextInt());
		obj.m2(sc.nextInt());
		System.out.print("m1"+b);
		return sc.nextInt();

	}

	
	public static void main(String[] args)
	{
		A obj=new A();
		obj.m1(sc.nextBoolean());
		
		

	}
}




