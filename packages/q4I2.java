package q4.p1.p2;

public interface q4I2
{
    default int m11(int a)
    {
        System.out.println("I2 m11()");
        return a + 70;
    }

    int m12(int a);
}