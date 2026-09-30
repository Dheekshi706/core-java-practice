import java.util.Scanner;
class Student{
		static Scanner sc=new Scanner(System.in);
		String name;
		int id;
		int marks;
		long mb;
		Student(String n,int idl,int m,long mbn)
		{
			name=n;
			id=idl;
			marks=m;
			mb=mbn;
		}
		void display()
		{
			System.out.println(name);
			System.out.println(id);
			System.out.println(marks);
			System.out.print(mb);
		}
		public static void main(String[] args)
		{
		(new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextLong())).display();
		}
}
		
			
		