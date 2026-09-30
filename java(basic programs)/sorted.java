import java.util.Scanner;
import java.util.*;
public class sorted{
	public static boolean sort(int arr[],int idx)
	{
		if(arr[idx]==arr.length()-1)
		{
			return true;
		}
		if(arr[idx]>=arr[idx+1])
		{
			
			return false; 
		}
		return sort(arr,idx);
	}
	public static void main(String[] args)
	{
		int arr[]={1,3,4,2,7};
		System.out.println(sort(arr,idx));
	}
}