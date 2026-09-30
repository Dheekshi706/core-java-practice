import java.util.Scanner;
public class user
{
	public static void main(String args[])
	{
		System.out.println("welcome");
		System.out.println("enter your name");
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		System.out.println("welcome" +n);
	}
}
