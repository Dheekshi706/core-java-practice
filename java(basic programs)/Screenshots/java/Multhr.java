import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.*
public class thrpri1 extends Thread
{
	int pno;
	public thrpri1(int n)
	{
		pno=n;
	}
	void show1()
	{
		System.out.println("show 1 called by thread"+pno);
	}
	void show2()
	{
		System.out.println("show 2 called by thread"+pno);
	}
	void show3()
	{
		System.out.println("show 3 called by thread"+pno);
	}

  public void run()
  {
	show1();
	show2();
	show3();
	show4();
	show5();
  }
public static void main(String args[])
{
	
	thrpri1 mt1=new thrpri1(1);
	thrpri1 mt2=new thrpri1(2);
	thrpr11 mt3=new thrpri1(3);
	mt1.SetPriority(2)
	mt2.SetPriority(8)
	mt3.SetPriority(6)
	mt1.start();
	mt2.start();
	mt3.start();
	
}
}




	
	
