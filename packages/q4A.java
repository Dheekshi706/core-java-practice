/*create a java application where we have one package, it contains one concrete class with one parameterized constructor and one method with parameter and RT, one abstract class it contains one parameterized constructor, one abstract method, and one defined method with parameter and return type, one interface, it contains one defined and one abstract method with parameter and return types, with respect to this package we have one subpackage it contains two interfaces, with respect to individual abstract and defined methods with P and RT, with respect to this package we have another sub-sub package it contains one concrete class with Parameterused constructor and one defined method with P and RT, two interfaces with respect to individual abstract and defined methods with P and RT, then access all these features into a separate class of separate packages like main package and sub package features by using import keyword, and sub-sub package features by using fully qualified name approach (Packages folder)*/
package q4;
import java.util.Scanner;
public class q4A
{
    public q4A(int x)
    {
        System.out.println("A Constructor: " + x);
    }

    public int m1(int a)
    {
        System.out.println("A m1()");
        return a;
    }

    public static abstract class q4B
    {
        public q4B(int x)
        {
            System.out.println("B Constructor: " + x);
        }

        public abstract int m2(int a);

        public int m3(int a)
        {
            System.out.println("B m3()");
            return a;
        }
    }

    public interface q4I
    {
        default int m4(int a)
        {
            System.out.println("I m4()");
            return a + 30;
        }

        int m5(int a);
    }
}