import java.util.Scanner;
class A
{
	private int pin;
	A(int pin)
	{
		this.pin=pin;
	}
	int getPin()
	{
		return pin;
	}
	void setPin(int Pin)
	{
		System.out.print(this.pin=pin);
	}
}
class Main
{
	public static void main(String[] args)
	{
		A x=new A(1233);
		System.out.print(x.getPin());
		x.setPin(4567);

		
	}
}