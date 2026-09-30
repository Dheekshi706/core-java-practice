/*9. create a java application where we have one interface it contains one abstract and one defined method, inside this interface we have two concrete classes with respect to individual methods, provide an implementation for the interface then invoke all these methods under the main with dynamic inputs. (IC.java) */
import java.util.Scanner;
import java.util.Scanner;

interface I
{
    Scanner sc = new Scanner(System.in);

    int m1(int a);

    default void m2(boolean b)
    {
        System.out.println("m2 method: " + b);
    }

    class A
    {
        void m3(String s)
        {
            System.out.println("m3 method: " + s);
        }
    }

    class B
    {
        double m4(double d)
        {
            System.out.println("m4 method: " + d);
            return sc.nextDouble();
        }
    }
}

class IC
{
	 static Scanner sc = new Scanner(System.in);
	 I obj = new I()
        {
            public int m1(int a)
            {
                System.out.println("m1 method: " + a);
                return sc.nextInt();
            }
        };
    public static void main(String[] args)
    {
	IC x=new IC();
        System.out.println(x.obj.m1(sc.nextInt()));
        x.obj.m2(sc.nextBoolean());

        I.A obj1 = new I.A();
        obj1.m3(sc.next());

        I.B obj2 = new I.B();
        System.out.println(obj2.m4(sc.nextDouble()));
    }
}