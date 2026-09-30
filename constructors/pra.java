import java.util.Scanner;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	static double balance=0;
	static Bank obj=new Bank();
	String Withdrawal(double withdraw_Amount)
	{
		if(withdraw_Amount>balance)
		{
			return "Insufficient Balance";
		}
		else
		{
			balance-=withdraw_Amount;
			return "withdraw sucess";
		}
	}
	String deposite(double deposite_Amount)
	{
		balance+=deposite_Amount;
		return "deposite succes";
	}
	double check()
	{
		return balance;
	}
	public static void main(String[] args)
	{
		System.out.println("enter your choice");
		System.out.println("1.withdrawl");	
		System.out.println("2.deposite");
		System.out.println("3.check balance");
		System.out.println("4.exit");
		boolean b=true;
		int c=0;
		while(b)
		{
		int n=sc.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("enter withdrawl Amount");
				System.out.println(obj.Withdrawal(sc.nextDouble()));
				break;
			case 2:
				System.out.println("enter deposite Amount");
				System.out.println(obj.deposite(sc.nextDouble()));
				break;
			case 3:
				System.out.println("check Amount");
				System.out.println(obj.check());
				break;
			case 4:
				System.out.println("thank you");
				b=false;
				break;
			default:
				System.out.print("enter correct choice");
				c++;
				if(c==3)
				{
					System.out.print("sorry try after some time");
					b=false;
				}
				break;
		}
		}
	}
}
			


	
	
			