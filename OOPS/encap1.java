import java.util.Scanner;
class Employee
{
	private int empID;
	private String empName;
	private double empSalary;
	public Employee(int empID,String empName,double empSalary)
	{
		this.empID=empID;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public void setEmpID(int empID)
	{
		this.empID=empID;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public void setEmpSalary(double empSalary)
	{
		this.empSalary=empSalary;
	}
	public int getEmpID()
	{
		return empID;
	}
	public String getEmpName()
	{
		return empName;
	}
	public double getEmpSalary()
	{
		return empSalary;
	}
}
class Test
{
	
	public static void main(String[] args)
	{
		Employee emp=new Employee(1,"raju",45000);
		System.out.print(emp.getEmpID());
		System.out.print(emp.getEmpName());
		System.out.print(emp.getEmpSalary());
		emp.setEmpSalary(700000);
		System.out.print(emp.getEmpSalary());
	}
}











