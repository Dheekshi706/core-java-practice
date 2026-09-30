/*class Student having variable like student name,id,marks,mobile number as a non static variables while creating the objects and print the details of student from non static method display () without any parameters &without any return type, display details of any two statements.*/
import java.util.Scanner;
class Student{
		static Scanner sc=new Scanner(System.in);
		String name;
		int id;
		int marks;
		long mb;
		Student()
		{
			System.out.print("no argument constructor");
			new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextLong());

		}
		
		Student(String name,int id, int marks,long mb)
		{
			System.out.print("param");
		  	this.name=name;
			this.id=id;
			this.marks=marks;
			this.mb=mb;
		}
		void display()
		{
			System.out.print("name"+name);
			System.out.print("id"+id);
			System.out.print("marks"+marks);
			System.out.print("mobile"+mb);
		}
				
	public static void main(String[] args)
	{	
		Student obj=new Student();
		obj.display();
		
	}
}