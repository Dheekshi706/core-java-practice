class customException extends Exception
{
public customException(string message)
{
super(message)
}
}
public class ExceptionHandling
{
public static void main(string args[])
{
try
{
int result=dividenumbers(10,0);
System.out.println("Result":+result);
}
catch(AirthmeticException e)
{
System.out.println("AirthmeticException:"+e.getMessage());
}
try
{
int age=getAge(10);
System.out.println("Age:"+age);
}
catch(customException e)
{
System.out.println("customException:"+e.getMessage());
}
}
public static int dividenumbers(int numerator,int denominator)
{
return numerator/denominator;
}
public static int getAge(int age)throws customException
{
if(age<0)
{
throws new customException("age cannot be negitive");
}
return age;
}
}
