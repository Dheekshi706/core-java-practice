import java.util.Scanner;
import java.util.*;
public class pal{
public static void dup(String str,int idx,String newstr)
{
	if(idx==str.length())
	{
		System.out.println(newstr);
		return;
	}
	char ch=str.charAt(idx);
	if(newstr.contains(String.valueOf(ch)))
	{
		dup(str,idx+1,newstr);
	}
	else{
		newstr+=ch;
		dup(str,idx+1,newstr);
	}
}
public static void main(String[] args)
{
	String str="ssagiduu";
	dup(str,0," ");
}
}

