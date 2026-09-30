import java.util.Scanner;
import java.util.*;
public class sum1{
public static void main(String[] args)
{
int arr[]={4,8,9,3,6};
int arr1[]={};


for(int i=arr.length-1;i>0;i--)
{
	arr1[i]=arr[i];
}
for(int i=0;i<arr.length-1;i++)
{
	System.out.println(arr1[i]);
}
}
}

