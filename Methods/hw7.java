import java.util.Scanner;
class Bank{
	static Scanner sc=new Scanner(System.in);
	static Bank obj=new Bank();
	static int amount=sc.nextInt();
	
	String withdraw(int a)
	{
		amount-=a;
		return "withdraw sucessfull";
	}
	String deposite(int dep)
	{
		amount+=dep;
		return "deposite sucessfull";
	}
	int checkBalance()
	{
		return amount;

	}
	public static void main(String[] args)
	{
		do{
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.println(obj.withdraw(sc.nextInt()));
				break;
			case 2:
				System.out.println(obj.deposite(sc.nextInt()));
				break;
			case 3:
				System.out.println(obj.checkBalance());
				break;
			case 4:
				System.out.println("invalid");
		}
		boolean b=sc.nextBoolean();
				
		}while(b);
}
}