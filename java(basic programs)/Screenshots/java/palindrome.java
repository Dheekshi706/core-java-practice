import java.util.*;
public class palindrome
{
	public static void main(String args[])
	{
		String original,reverse=" ";
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		string Original=s.nextLine();
		int length=Original.length();
		    for (int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
			if(original.equals (reverse))
			  System.out.println("string not palindrome");

			else
			  System.out.println("string not palindrome");
			
	}
}
