package p3.p4;
public interface I2
	{
   		 public abstract int m31(int a);
    		public default int m32(int b)
   	 	{
        		return b * b;
    		}
	}
