package p3.p4;
public interface I1
{
    public abstract int m21(int a);
    public default int m22(int b)
    {
        return b * b;
    }
}	
	