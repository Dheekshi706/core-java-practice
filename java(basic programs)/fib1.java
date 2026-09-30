import java.util.Scanner;
public class fib1{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int ans=a+b;
		System.out.println(ans);
		a=b;
		b=ans;
	}
	}
}