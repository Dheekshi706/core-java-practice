class CustomException extends Exception
{
public CustomException(string message)
{
super(message);
}
}
public class ExceptionHandling
{
public static void main(string args[])
{
try
{
int result=dividenumbers(10,0);
System.out.println("Result:"+result);
System.out.println("Result:"+result);
}
Catch(Airthmetic Exception e)
{
System.out.println("AirthmeticException:"+e.getMessage());
}
try
{
int age=getAge(10);
System.out.println("Age:"+age);
}
Catch(CustomException e)
{
System.out.println("customException:"+e.getMessage());
}
}
public static int divideNumbers(int numerator,int denominator)
{
return numerator/denominator;
}
public static int getAge(int age)throws CustomException
{
if(age<0)
{
throw new CustomException("age cannot be negitive");
}
return age;
}
}
