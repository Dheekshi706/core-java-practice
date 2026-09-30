import java.util.*;
import java.util.ArrayList;
class remdup{
	public static int main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		ArrayList<Integer> brr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt(i);
		}
		for(int num:arr)
		{
			if(!brr.contains(num))
			{
				brr.add(num);
			}
		}
		System.out.println(brr);
	}
}
		