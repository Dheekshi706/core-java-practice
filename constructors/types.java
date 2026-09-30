import java.util.Scanner;
class A{
		static Scanner sc=new Scanner(System.in);
		int pin;
		A(int n)
		{
			pin=n;
		}
		static void disPin(A obj)
		{
			System.out.print(obj.pin);
		}
		public static void main(String[] args)
		{
			A obj=new A(sc.nextInt());
			disPin(obj);
		}
}