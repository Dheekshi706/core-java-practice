class stu
{
	void me()
	{
		System.out.println("good morning stu");
	}
}
class fa extends stu
{
	void me()
	{
		System.out.println("good morning stu");
	}

	void display()
	{
		me();
		super.me();
	}

	public static void main(String args[])
	{
		stu s=new stu();
		s.display();
	}
}

	