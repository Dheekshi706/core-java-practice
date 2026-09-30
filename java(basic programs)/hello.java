import java.util.Scanner;

public class hello
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n -i-1; j++) {
				System.out.print("b");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				if (j < i) {
					System.out.print("b");
				}
				

			}
			
			
			
			

			
			
			System.out.println();
			
		}

	}

    
}
