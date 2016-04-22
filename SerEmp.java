import java.io.*;
class Emp implements Serializable
{
int id;
String name;
static String cname="Matrix Inc.";
Emp(int id,String name)
{
this.id=id;
this.name=name;
}
public void show()
{
	System.out.println("ID:"+id+"\tName:"+name);
}

}
class SerEmp
{
	public static void main(String[] args)throws Exception {
		//Storing a Serializable File
		
	/*
	Emp e1=new Emp(7860,"Moonis");
	Emp e2=new Emp(1234,"Logan");

	FileOutputStream f=new FileOutputStream("serbackup.me");
	ObjectOutputStream ob=new ObjectOutputStream(f);

	ob.writeObject(e1);
	ob.writeObject(e2);
	*/

	//Retriving a Serializable File

	FileInputStream fo=new FileInputStream("serbackup.me");
	ObjectInputStream obf= new ObjectInputStream(fo);

	Emp n1=(Emp)obf.readObject();				
	Emp n2=(Emp)obf.readObject();

	n1.show();
	n2.show();				

	}
}