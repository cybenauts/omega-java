class Student
{
	int id;
	String name;
	String dept;
	String phone;

	/*Student()
	{
		this.id=0;
		this.name=null;
		this.dept=null;
	}*/
	Student(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public void display()
	{
		System.out.println("ID:"+id+"\n"+"Name:"+name+"\n"+"Dept:"+dept);
	}

}
class Exec
{
	public static void main(String ...args)
	{
		Student s=new Student(2014,"Moonis","CSE");
		s.display();

	}
}