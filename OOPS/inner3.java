abstract class A
{
    abstract void m1();

    abstract class B
    {
        abstract void m2();
    }
}


 class C extends A.B
{
    void m2()
    {
        System.out.println("m2 method");
    }

    class C1 extends A
    {
        void m1()
        {
            System.out.println("m1 method");
        }
    }


    public static void main(String[] args)
    {
	
	C.C1 obj1 = new C1();
	obj1.m1();

    }
}