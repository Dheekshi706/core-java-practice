import java.util.Scanner;
import java.util.*;
public class bubble{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp;
	int arr[]=new int[n];
	for(int i=0;i<n-1;i++)
		
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n-i-1;j++)
		{
		if(arr[i]>arr[i+1])
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		}
	}
	for(int i=0;i<n;i++)
		
	{
		System.out.println(arr[i]);
	}
}
}
		
		