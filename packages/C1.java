package p5;

import java.util.Scanner;

import p3.p1;
import p3.p4.I1;
import p3.p4.I2;

public class C1 extends p1.pa1 implements p1.I, I1, I2
{
    static Scanner sc = new Scanner(System.in);

    public C1(int a)
    {
        super(100);
    }

    public int m3(int a)
    {
        System.out.println("m3: " + a);
        return a + 10;
    }

    public boolean m6(int b)
    {
        System.out.println("m6: " + b);
        return b > 0;
    }

    public int m21(int a)
    {
        System.out.println("m21: " + a);
        return a + 20;
    }

    public int m31(int a)
    {
        System.out.println("m31: " + a);
        return a + 30;
    }

    public static void main(String[] args)
    {
       

      

        p1 obj1 = new p1(10);

        System.out.println("m1" + p1.m1(10));
        System.out.println("m2" + obj1.m2(32));

        C1 obj2 = new C1(10);

        System.out.println("m3" + obj2.m3(57));
        System.out.println("m4" + obj2.m4(98));

        System.out.println("m5" + p1.I.m5(8));
        System.out.println("m6" + obj2.m6(987));

        System.out.println("m21" + obj2.m21(876));
        System.out.println("m22" + obj2.m22(76));

        System.out.println("m31" + obj2.m31(765));
        System.out.println("m32" + obj2.m32(76));
    }
}