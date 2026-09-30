import java.util.Scanner;
public class max
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	if(a>b)
	{
		System.out.println("a is greater");
		if(c>a){
			System.out.println("c is greater");
		}
			
	}
	else{
		System.out.println("b is greater");
	}
	}
}
