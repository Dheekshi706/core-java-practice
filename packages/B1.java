package pkg6;

import java.util.Scanner;
import pkg5.A1;

public class B1 extends A1.A2 implements A1.I1, A1.I2
{
    static Scanner sc = new Scanner(System.in);

    public int m3()
    {
        System.out.print("m3");
        return 50;
    }

    public int m5()
    {
        System.out.print("m5");
        return 30;
    }

    public int m6()
    {
        System.out.print("m6");
        return 10;
    }

    public B1(boolean b)
    {
        super(b);
    }

    public static void main(String[] args)
    {
        A1 obj = new A1();

        System.out.print(obj.a);

        A1 obj1 = new A1(sc.nextInt());

        A1.m1(true);

        B1 obj2 = new B1(true);

        obj2.m3();
        obj2.m4(10);
        obj2.m5();
        obj2.m6();
        obj2.display1();
        obj2.display2();
    }
}