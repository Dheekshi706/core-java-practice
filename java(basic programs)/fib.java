import java.util.Scanner;
public class fib
{
	static int fibonacci(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String args[])
	{
		System.out.println("number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("fibnocci series are");
		for(int i=0;i<=n;i++)
			System.out.println(fibonacci(i));
	}
}

		
			