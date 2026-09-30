import java.util.Scanner;
class A{
	int pin=10;
	A(int pin)
	{
		System.out.println(this.pin);
		this.pin=pin;
	}
	A(A obj)
	{
		pin=obj.pin;
	}
	void display()
	{
		System.out.println(pin);
	}
	public static void main(String[] args)
	{
		A x1=new A(1234);
		x1.display();
		A x2=new A(4321);
		x2.display();
		A x3=new A(x1);
		x3.display();
	}
}