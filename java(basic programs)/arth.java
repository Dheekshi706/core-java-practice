import java.util.Scanner;
public class arth{
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter a,b values");
	int a=in.nextInt();
	int b=in.nextInt();
	System.out.println("enter operator");
	char op=in.next().charAt(0);
	switch(op)
	{
		case '+':
			System.out.println("addition is" + (a+b));
			break;
		case '-':
			System.out.println("subtraction is" + (a-b));
			break;
		case '*':
			System.out.println("multiplication is" + (a*b));
			break;
		case '/':
			System.out.println("division is" + (a/b));
			break;
		case '%':
			System.out.println("modulus is" + (a%b));
			break;
			
		
	}
}
}
