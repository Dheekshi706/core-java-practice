import java.util.Scanner;
public class fact1
{
	static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	
	
		public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int n=s.nextInt();
		int f=fact(n);
		System.out.println("recursive method"+f);
		int factorial=1;
		for(i=j;i>=1;i--)
			factorial=factorial*i;
		System.out.println("non recursive method"+factorial);
		
		
		
		
	}
		
}

		