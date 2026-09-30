import java.util.Scanner;
import java.util.*;
public static class occurance{
	 int first=-1;
	 int last=-1;
	public static void reversestr(String str,int idx,char ele)
	{
	
	if(idx==str.length())
	{
	System.out.println(first);
	System.out.println(last);
	return;
	}
	char character=str.charAt(idx);
	if(character==ele)
	{
		if(first==-1)
		{
			first=idx;
		}
		else{
			last=idx;
		}
	}
	reversestr(str,idx+1,ele);
	}
	public static void main(String[] args)
	{
		
		String str="ajdsahgc";
		reversestr(str,0,'a');
	}
}