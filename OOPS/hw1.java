class Employee
{
    String Ename;
    int empid;
    double empsal;

    Employee(String Ename, int empid, double empsal)
    {
        this.Ename = Ename;
        this.empid = empid;
        this.empsal = empsal;
    }
}

class Developer extends Employee
{
    String empDesignation;

    Developer(String Ename, int empid, double empsal, String empDesignation)
    {
        super(Ename, empid, empsal);
        this.empDesignation = empDesignation;
    }

    void displayDetails()
    {
        System.out.println("----- Developer Details -----");
        System.out.println("Employee Name : " + Ename);
        System.out.println("Employee ID   : " + empid);
        System.out.println("Employee Salary : " + empsal);
        System.out.println("Designation   : " + empDesignation);
    }
}

class TestingEngineer extends Employee
{
    String empDesignation;

    TestingEngineer(String Ename, int empid, double empsal, String empDesignation)
    {
        super(Ename, empid, empsal);
        this.empDesignation = empDesignation;
    }

    void displayDetails()
    {
        System.out.println("----- Testing Engineer Details -----");
        System.out.println("Employee Name : " + Ename);
        System.out.println("Employee ID   : " + empid);
        System.out.println("Employee Salary : " + empsal);
        System.out.println("Designation   : " + empDesignation);
    }
}

class Test
{
    public static void main(String[] args)
    {
        Developer d1 = new Developer("Rahul", 101, 65000, "Java Developer");

        TestingEngineer t1 = new TestingEngineer("Priya", 102, 55000, "Testing Engineer");

        d1.displayDetails();
        System.out.println();
        t1.displayDetails();
    }
}