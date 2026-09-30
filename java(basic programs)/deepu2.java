import java.util.Scanner;
public class deepu2{
	public static void main(String[] args)
	{
	int num1,num2,op,ans;
	Scanner in=new Scanner(System.in);
	char op=in.nextCharAt();
	int num1=in.nextInt();
	int num2=in.nextInt();
	if(op=='+' || op=='-')
	{
		if(op=='+')
		{
			ans=num1+num2;
		}
		else if(op=='-')
		{
			ans=num1-num2;
		}
	}
	else
	{
		System.out.println("invalod");
	}
}
}

	