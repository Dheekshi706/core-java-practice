/*create a java application with a class calculate having a non static method calculate() with two integer parameters abd return integer(0) inherit this method to class Adition and multiplication reimplement or override the calculate method in both the classes to perfom addition &multiplication operations invoke calculatemethod() from the main method at users choice to perform respective operation*/
import java.util.Scanner;
class Shape
	{
		int area(int a,int b)
		{
			return 0;
		}
	}
class Rect extends 
	{
		int calculate(int a,int b)
		{
			return a+b;
		}

	}
class Multi extends Calculate
	{
		

		int calculate(int a,int b)
		{
			return a*b;
		}
	}
class Test{
		public static void main(String[] args)

		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			Multi obj=new Multi();
			System.out.print(obj.calculate(a,b));
			
		}
			
			
	}


	
		