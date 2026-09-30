import java.util.Scanner;
public class prime
 {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr num");
		int n=sc.nextInt();
		System.out.println("prime numbers");
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				count++;
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
		
		}
	}
 }