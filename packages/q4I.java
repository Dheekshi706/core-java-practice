package q4.p1;

public interface q4I
{
    default int m6(int a)
    {
        System.out.println("I1 m6()");
        return a + 40;
    }

    int m7(int a);
}