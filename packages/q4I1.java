package q4.p1;

public interface q4I1
{
    default int m8(int a)
    {
        System.out.println("I2 m8()");
        return a + 50;
    }

    int m9(int a);
}