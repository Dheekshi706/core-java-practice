import java.util.Scanner;
import java.util.*;
public class move{
	public static void move(String str,int idx,int count,String newstr)
	{
		
		if(idx==str.length())
		{
			for(int i=0;i<=count;i++)
			{
				newstr+='x';
			}
			System.out.println(newstr);
			return;
		}
		char character=str.charAt(idx);
		if(character=='x')
		{
			count++;
			move(str,idx+1,count,newstr);
		}
		else{
			newstr+=character;
			move(str,idx+1,count,newstr);
		}
	}
	public static void main(String[] args)
	{
		String str="axbxcxxd";
		move(str,0,0," ");
	}
}
			