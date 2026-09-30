import java.util.Scanner;
class Student{
		static Scanner sc=new Scanner(System.in);
		int id;
		String name;
		long mb;
		int per;
		Student(int id,String name,long mb,int per)
		{
			this.name=name;
			this.id=id;
			this.mb=mb;
			this.per=per;
		}
		void display()
		{
			System.out.println("name"+name);
			System.out.println("sid"+id);
			System.out.println("marks"+mb);
			System.out.println("phone number"+per);
		}
		public static void main(String[] args)
		{
			Student s1=new Student(sc.nextInt(),sc.next(),sc.nextLong(),sc.nextInt());
			Student s2=new Student(sc.nextInt(),sc.next(),sc.nextLong(),sc.nextInt());
			Student s3=new Student(sc.nextInt(),sc.next(),sc.nextLong(),sc.nextInt());

			s1.display();

			s2.display();
			s3.display();
		}
}

					
			
	