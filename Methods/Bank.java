import java.util.Scanner;
class Bank{
	static Scanner sc=new Scanner(System.in);
	double balance;	
	String withdraw(double withdrawlAmount)
	{
		if(withdrawlAmount<=balance)
		{
			balance-=withdrawlAmount;
			return "withdraw sucessfull:"+withdrawlAmount;
		}
		else
		{
			return "Insuffient Balance";
		}
	}
	String deposite(double depositeAmount)
	{
		if(depositeAmount<=0)
		{
			return "Deposite Failed";
		}
		else
		{
			balance+=depositeAmount;
			return "Deposite Sucessful:"+depositeAmount;
		}
	}
	double checkBalance()
	{
		return balance;

	}
	public static void main(String[] args)
	{
		boolean b=true;
		int c=0;
		Bank obj=new Bank();
		System.out.println("============================================================================");
		System.out.println("WELCOME TO SBI BANK");
		System.out.println("============================================================================");
		while(b)
		{
			System.out.println("\n ***********************************************************************");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			System.out.println("******************************************************************************");
			switch(choice)
			{
				case 1:
					if(c!=0)
					c=0;
					System.out.println("Enter Withdrawl Amount:");
					System.out.println(obj.withdraw(sc.nextDouble()));
					break;
				case 2:
					if(c!=0)
					c=0;
					System.out.println("Enter Deposite Amount:");
					System.out.println(obj.deposite(sc.nextDouble()));
					break;
				case 3:
					if(c!=0)
					c=0;
					System.out.println("Current Balance:"+obj.checkBalance());
					break;
				case 4:
					System.out.println("\n <<<<<<<<<<<<<<<<<<<<<<<<Thank You   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					b=false;
					break;
				default:
					System.out.println("Invalid choice!please select the correct option");
					c++;
					if(c==3)
					{
						System.out.println("completed all three attempts try again later");
						b=false;
					}
			}
		}
	}
}












						