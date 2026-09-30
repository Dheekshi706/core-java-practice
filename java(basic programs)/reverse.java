import java.util.Scanner;
import java.util.*;
public class reverse{
	public static void reversestr(String str,int idx)
	{
		if(idx==0)
		{
			System.out.print(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
		reversestr(str,idx-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		reversestr(str,str.length()-1);
	}
}
		
		
		