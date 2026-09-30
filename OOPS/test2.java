//class name empployee,private ,id,name,price provide setter and getter methods print //product details ,static display method in method 
import java.util.Scanner;
class Employee
{
	private int emp_id;
	private String name;
	private double sal;
	Employee(int emp_id,String name,double sal)
	{
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
	}
	int getEmpId()
	{
		return emp_id;
	}
	String getName()
	{
		return name;
	}
	double getEmpsal()
	{
		return sal;
	}
	void setEmpId(int id)
	{
		emp_id=id;
	}
	void setName(String E_name)	
	{
		name=E_name;
	}
	void setSal(double salary)
	{
		sal=salary;
	}
}
class B
{

	static Scanner sc=new Scanner(System.in);

	static void display(Employee obj)
	{
		System.out.println("id"+obj.getEmpId());
		System.out.println("name"+obj.getName());
		System.out.println("sa"+obj.getEmpsal());
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		display(obj);
		
		
	}
		
}

	