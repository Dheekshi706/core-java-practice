import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(i%2==1)
				System.out.print(j);
				else
					System.out.print(ch++);
			}
			ch='A';
			System.out.println();
		}
	}
}
		