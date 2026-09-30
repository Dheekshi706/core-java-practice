import java.util.Scanner;
import java.util.*;
public class tempracture{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	double area=2*Math.PI*n*(n+m);
	System.out.printf("%.4f",area);
}
}
