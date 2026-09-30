import java.util.Scanner;
class ShoppingCart{
		static Scanner sc=new Scanner(System.in);
		static double createcart(int quan)
		{
			
			ShoppingCart obj=new ShoppingCart();
			double res=(obj.calculateBill(sc.nextInt()));
			return res*quan;
		}
		double calculateBill(int price)
		{
			
			return price;
		}
		public static void main(String[] args)
		{
			System.out.println("enter cart number");
			System.out.println(createcart(sc.nextInt()));
		}
	}