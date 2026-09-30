import java.util.Scanner;
public class fact
{
	static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		else
			return(n*fact(n-1));
	}
	public static void main(String args[])
	{
		System.out.println("enetr number");
		Scanner s=new Scanner(System.in);
		int j=s.nextInt();
		int f=fact(j);
		System.out.println("Recursive metohd factorial of given="+f);
		int factorial=1;
		for(int i=j;i>=1;i--)
			factorial=factorial*i;
		System.out.println("non Recursive metohd factorial of given="+factorial);
	}
}

	