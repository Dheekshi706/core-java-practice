package test;

import q4.q4A;
import q4.p1.q4I;
import q4.p1.q4I1;

public class Main extends q4A.q4B
        implements q4A.q4I, q4I, q4I1
{
   
    public Main(int x)
    {
        super(x);
    }
    public int m2(int a)
    {
        System.out.println(" m2");
        return a + 10;
    }
    public int m5(int a)
    {
        System.out.println("m5");
        return a + 20;
    }
    public int m7(int a)
    {
        System.out.println("m7");
        return a + 30;
    }
    public int m9(int a)
    {
        System.out.println("m9");
        return a + 40;
    }

    public static void main(String[] args)
    {
        q4A a = new q4A(10);

        System.out.println(a.m1(5));
        Main obj = new Main(a);
        System.out.println(obj.m2(5));
        System.out.println(obj.m3(5));

        System.out.println(obj.m4(5));
        System.out.println(obj.m5(5));

        System.out.println(obj.m6(5));
        System.out.println(obj.m7(5));

        System.out.println(obj.m8(5));
        System.out.println(obj.m9(5));

        q4.p1.p2.q4C c =
            new q4.p1.p2.q4C(50);

        System.out.println(c.m10(5));

        q4.p1.p2.q4I2 i2 =
            new q4.p1.p2.q4I2()
            {
                public int m12(int a)
                {
                    System.out.println("q4I2 m12()");
                    return a + 90;
                }
            };

        System.out.println(i2.m11(5));
        System.out.println(i2.m12(5));
        q4.p1.p2.q4I3 i3 =
            new q4.p1.p2.q4I2()
            {
                public int m14(int a)
                {
                    System.out.println("m14()");
                    return a + 100;
                }
            };

        System.out.println(i3.m13(5));
        System.out.println(i3.m14(5));
    }
}