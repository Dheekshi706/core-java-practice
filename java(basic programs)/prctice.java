import java.util.Scanner;
public class deepu
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int n=sc.nextInt();
	System.out.println("prime are");
	int count=0;
	for(int i=0;i<=n;i++)
	{
		count=0;
		for(int j=0;j<i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println(i);
			}
		
	}
	
	
	}
}