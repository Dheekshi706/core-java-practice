/* create a java Application with a class product with private fields like product id,name,product price initilize those fields while instatncition (constructor injection) and create setters and getters create 'TEST'CLASS having a static method display without any return type with product class object as a parametr print the product details from display method.invoke display method under main mathod print atleast details of two products and update product price of 1 product and then print details of produc again*/
import java.util.Scanner;
class Product
{
	private int p_ID;
	private String p_Name;
	private double p_Price;
	public Product(int p_ID,String p_Name,double p_price)
	{
		this.p_ID=p_ID;
		this.p_Name=p_Name;
		this.p_Price=p_price;
	}
	public void setp_ID(int p_ID)
	{
		this.p_ID=p_ID;
	}
	public void setp_Name(String p_Name)
	{
		this.p_Name=p_Name;
	}
	public void setp_Price(double p_Price)
	{
		this.p_Price=p_Price;
	}
	public int getp_ID()
	{
		return p_ID;
	}
	public String getp_Name()
	{
		return p_Name;
	}
	public double getp_Price()
	{
		return p_Price;
	}
}
class Test
{
	static void display(Product obj)
	{
		System.out.println(obj.getp_ID());
		System.out.println(obj.getp_Name());
		System.out.println(obj.getp_Price());
	}	
	public static void main(String[] args)
	{
		Product obj=new Product(1,"CHAIN",450.0);
		Product obj1=new Product(2,"laptop",80000.0);
		display(obj);
		display(obj1);
		obj.setp_Price(500);
		System.out.println(obj.getp_Price());
	}
}











