import pkg2.B;
import pkg1.A;
class C extends B
{
		public void m3()
		{
			System.out.print("m3");
		}
	public static void main(String[] args)
	{
		new C().m2();
		new C().m3();

		new A().m1();
		


	}
}