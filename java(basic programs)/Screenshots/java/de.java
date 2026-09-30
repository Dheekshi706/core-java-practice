class Myth1 extends Thread
{
public void run()
{
	int i;
	for(i=1;i<=3;i++)
	System.out.println("thread11:"+i);
}
}
class Myth2 extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=3;i++)
	        System.out.println("thread12:"+i);
	}
}
class Myth3 extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=3;i++)
		System.out.println("thread13:"+i);
	}
}
public class demo
{
	public static void main(String args[])
	{
		Myth1.o1=new.Myth1();
		Myth2.o2=new.Myth2();
		Myth3.o3=new.Myth3();
		o1.start();
		o2.start();
		o3.strat();
	}
}

