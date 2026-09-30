import java.util.Scanner;
import java.util.*;
public class sort{
	public static boolean issort(int arr[],int idx)
	{
		if(arr[idx]==arr.length-1)
		{
			return true;
		}
		if(arr[idx]>=arr[idx+1])
		{
			
			return false; 
		}
		
		return issort(arr,idx+1);
		
	}
	public static void main(String[] args)
	{
		int arr[]={1,4,5,6,7};
		System.out.println(issort(arr,0));
	}
}